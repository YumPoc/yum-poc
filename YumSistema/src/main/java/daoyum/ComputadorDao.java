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
    private int idCliente;
    private static int idComputador;
    private String comandoInsertOuUpdate;
    private boolean update;

    //pega a url de conecção da classe Connection
    public ComputadorDao() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().getConexao();
    }

    //Adiciona informacoes Dinamicas no Banco De Dados
    public void adicionaDinamicas(InfoDinamicas dinamicas) {
      
        try {
            // cria um preparedStatement
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO computadores_dinamico"
                + " (cod_computador, quant_bateria_usada, uso_cpu, uso_disco, download, upload, uso_ram)"
                    + " values (?, ?, ?, ?, ?, ?, ?);");

            // seta os valores no PreparedStatement
            comando.setInt(1, idComputador);
            comando.setFloat(2, dinamicas.getBateriaUsada());
            comando.setFloat(3, dinamicas.getUsoCPU());
            comando.setFloat(4, dinamicas.getUsoDisco());
            comando.setFloat(5, dinamicas.getDownload());
            comando.setFloat(6, dinamicas.getUpload());
            comando.setFloat(7, dinamicas.getUsoRAM());

            // abre e executa conecção
            comando.execute();
            // fecha conecção
            comando.close();

        } catch (SQLException e) {
            System.out.println("InsertException: " + e);
        }
        
         catch (Exception e) {
            System.out.println("WhileException: " + e);
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
            if(update){
                computadorGeral.setInt(11, idComputador);
                computadorGeral.setInt(12, idCliente);
            }            
            
            // abre e executa conecção 
            computadorGeral.execute();
            // fecha conecção
            computadorGeral.close();

        } catch (SQLException e) {
            System.out.println("SQLException ComputadorDao adicionaGerais");
            throw new RuntimeException(e);
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

            while (execteQuery.next()) {
                idComputador = execteQuery.getInt("id_computador");
                verificarComputador = true;
            }

        } catch (SQLException ex) {
            System.out.println("SQLException ComputadorDao VerificarComputador");
            Logger.getLogger(ComputadorDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        comandoAdicionaOuAtualiza(verificarComputador);
        return verificarComputador;

    }

    //Verificar se o usuario existe
    public boolean logar(String email, String senha) {
        boolean logar = false;
        String comando = "select id_cliente from cadastro_cliente where email_contato = ? and senha = ?;";

        try {
            PreparedStatement selectCliente = conexao.prepareStatement(comando);
            selectCliente.setString(1, email);
            selectCliente.setString(2, senha);

            ResultSet executeQuery = selectCliente.executeQuery();

            while (executeQuery.next()) {
                idCliente = executeQuery.getInt("id_cliente");
                logar = true;
            }
            selectCliente.close();

        } catch (SQLException ex) {
            System.out.println("SQLException ComputadorDao logar");
            Logger.getLogger(ComputadorDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return logar;

    }

    private void comandoAdicionaOuAtualiza(boolean existe) {
        if (existe) {
            update = existe;
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
            update = existe;
            comandoInsertOuUpdate = ("INSERT INTO computadores_gerais (id_computador, numero_ip, nome_computador, " +
                "endereco_mac, setor_hospital, tipo_processador, tipo_sistema_operacional, tamanho_hd, " +
                "tamanho_ram, cod_cliente) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
        }
        
    }

    public void setIdComputador(int idComputador) {
        this.idComputador = idComputador;
    }

}
