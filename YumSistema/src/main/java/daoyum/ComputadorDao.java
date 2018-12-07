package daoyum;

import sistemayum.*;
import connectionyum.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ComputadorDao {

    private Connection conexao;
    private InfoGerais infoGerais = new InfoGerais();
    private InfoDinamicas infoDinamicas = new InfoDinamicas();
    private static int idCliente;
    private static String nomeCliente;
    private static int idComputador;
    private String comandoInsertOuUpdate;
    private boolean update;
    private Thread infoDinamic;
    private volatile static boolean ativo;

    //pega a url de conecção da classe Connection
    public ComputadorDao() throws ClassNotFoundException {
        try{
        this.conexao = new ConnectionFactory().getConexao();
        }catch(Exception ex){
            Log.gerarLog("Falha ao se conectar");
        }
    }

    public void infoDinamicasNaThread(InfoDinamicas dinamicas) {
        ativo = true;
        infoDinamic = new Thread(() -> {
            try {
                this.adicionaDinamicas(dinamicas);
            } catch (InterruptedException ex) {
                Log.gerarLog("ComputadorDao infoDinamicasNaThread: " + ex);
                Logger.getLogger(ComputadorDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        infoDinamic.start();
    }

    public void infoDinamicasPararThread() {
        this.ativo = false;
        infoDinamic = null;
        System.out.println("PARAR THREAD:" + ativo);
    }

    //Adiciona informacoes Dinamicas no Banco De Dados
    public void adicionaDinamicas(InfoDinamicas dinamicas) throws InterruptedException {
        while (ativo) {
            dinamicas.atualizarDinamico();
            try {
                // cria um preparedStatement
                PreparedStatement comando = conexao.prepareStatement("INSERT INTO computadores_dinamico"
                        + " (cod_computador, quant_bateria_usada, uso_cpu, uso_disco, download, upload, uso_ram)"
                        + " VALUES (?, ?, ?, ?, ?, ?, ?);");

                // seta os valores no PreparedStatement
                comando.setInt(1, idComputador);
                comando.setFloat(2, dinamicas.getBateria());
                comando.setFloat(3, dinamicas.getUsoCPU());
                comando.setFloat(4, dinamicas.getUsoDisco());
                comando.setFloat(5, dinamicas.getDownload());
                comando.setFloat(6, dinamicas.getUpload());
                comando.setFloat(7, dinamicas.getUsoRAM());

                // abre e executa conecção
                comando.execute();
                // fecha conecção
                comando.close();

            } catch (SQLException ex) {
                Log.gerarLog("SQLException ComputadorDao adicionaDinamicas: " + ex);
                Logger.getLogger(ComputadorDao.class.getName()).log(Level.SEVERE, null, ex);

            } catch (Exception ex) {
                Log.gerarLog("Exception ComputadorDao adicionaDinamicas: " + ex);
                Logger.getLogger(ComputadorDao.class.getName()).log(Level.SEVERE, null, ex);

            }
            System.out.println(System.currentTimeMillis());
            System.out.println("A thread deu Loop:" + ativo);
            Thread.sleep(1000L);
            System.out.println(System.currentTimeMillis());
        }
    }

    //Adiciona as informações no banco
    public void adicionaGerais(InfoGerais gerais) {

        try {
            PreparedStatement computadorGeral = conexao.prepareStatement(comandoInsertOuUpdate);

            //seta os valores
            computadorGeral.setInt(1, idComputador);
            computadorGeral.setString(2, gerais.getNumeroIp());
            computadorGeral.setString(3, gerais.getNomeComputador());
            computadorGeral.setString(4, gerais.getEnderecoMac());
            computadorGeral.setString(5, gerais.getSetorHospital());
            computadorGeral.setString(6, gerais.getTipoProcessador());
            computadorGeral.setString(7, gerais.getSistemaOperacional());
            computadorGeral.setString(8, gerais.getTamanhoHd());
            computadorGeral.setString(9, gerais.getTamanhoRam());
            computadorGeral.setInt(10, idCliente);

            //verifica se for update e seta a verificação do where
            if (update) {
                computadorGeral.setInt(11, idComputador);
                computadorGeral.setInt(12, idCliente);
            }

            // abre e executa conecção 
            computadorGeral.execute();
            // fecha conecção
            computadorGeral.close();

        } catch (SQLException ex) {
            Log.gerarLog("ComputadorDao adicionaGerais: " + ex);
            throw new RuntimeException(ex);
        }

    }

    //Verificar se o ID do computador já existe ou não no banco
    public boolean verificarComputador(int patrimonio) {

        boolean verificarComputador = false;
        String comando = "select id_computador from computadores_gerais where id_computador = ?;";

        try {

            PreparedStatement selectComputador = conexao.prepareStatement(comando);
            selectComputador.setInt(1, patrimonio);

            ResultSet execteQuery = selectComputador.executeQuery();

            if(execteQuery.next()) {
                idComputador = execteQuery.getInt("id_computador");
                verificarComputador = true;
            }

        } catch (SQLException ex) {
            Log.gerarLog("ComputadorDao VerificarComputador: " + ex);
            Logger.getLogger(ComputadorDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        comandoAdicionaOuAtualiza(verificarComputador);
        return verificarComputador;

    }

    //Verificar se o usuario existe
    public boolean logar(String email, String senha) {

        boolean logar = false;
        String comando = "select id_cliente, nome_fantasia from cadastro_cliente where email_contato = ? and senha = ?;";

        try {
            PreparedStatement selectCliente = conexao.prepareStatement(comando);
            selectCliente.setString(1, email);
            selectCliente.setString(2, senha);
            
            ResultSet executeQuery = selectCliente.executeQuery();

            while (executeQuery.next()) {
                idCliente = executeQuery.getInt(1);
                nomeCliente = executeQuery.getString(2);
                logar = true;
            }
            selectCliente.close();
            
        } catch (SQLException ex) {
            Log.gerarLog("ComputadorDao logar: " + ex);
            Logger.getLogger(ComputadorDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return logar;

    }

    private void comandoAdicionaOuAtualiza(boolean existe) {

        if (existe) {
            update = true;
            comandoInsertOuUpdate = ("UPDATE computadores_gerais SET "
                    + "id_computador= ?, "
                    + "numero_ip= ?, "
                    + "nome_computador= ?, "
                    + "endereco_mac= ?, "
                    + "setor_hospital= ?, "
                    + "tipo_processador= ?, "
                    + "tipo_sistema_operacional= ?, "
                    + "tamanho_hd= ?, "
                    + "tamanho_ram= ?, "
                    + "cod_cliente= ? "
                    + "WHERE id_computador = ? AND cod_cliente = ?;");
        } else {
            update = false;
            comandoInsertOuUpdate = ("INSERT INTO computadores_gerais (id_computador, numero_ip, nome_computador, "
                    + "endereco_mac, setor_hospital, tipo_processador, tipo_sistema_operacional, tamanho_hd, "
                    + "tamanho_ram, cod_cliente) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
        }

    }

    public void setIdComputador(int idComputador) {
        ComputadorDao.idComputador = idComputador;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    

}
