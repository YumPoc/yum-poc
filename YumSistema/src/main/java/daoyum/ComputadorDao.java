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
    private int idComputador;
    private String comandoInsertOuUpdate;

    public ComputadorDao() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().getConnection();
    }

    //Adiciona informacoes Dinamicas no Banco De Dados
    private void adicionaDinamicas(InfoDinamicas dinamicas) {
        //Fazer o mesmo que foi feito com a adicionar infoGerais,Só que para a tabela de info Dinamicas
    }

    //Adiciona as informações no banco
    public void adicionaGerais(InfoGerais gerais) {
        gerais.atualizarInfoGerais();

        try {
            PreparedStatement computadorGeral = conexao.prepareStatement(comandoInsertOuUpdate);

            //seta ps valores
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

            System.out.println(computadorGeral.toString());
            computadorGeral.execute();
            computadorGeral.close();
            
        } catch (SQLException e) {
            System.out.println("SQLException ComputadorDao adicionaGerais");
            throw new RuntimeException(e);
        }
    }

    //Verificar se o ID do computador já existe ou não no banco
    public boolean verificarComputador(int patrimonio) {
        boolean verificarComputador = false;
        String comando = "select id_computador from computadores_gerais where id = ?;";

        PreparedStatement selectComputador;
        try {

            selectComputador = conexao.prepareStatement(comando);
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
                System.out.println("id_cliente: " + idCliente);
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
            comandoInsertOuUpdate = ("UPDATE computadores_gerais SET "
                    + "id_computador = ?,"
                    + "id_computador=?,"
                    + "numero_ip=?,"
                    + "nome_computador=?,"
                    + "endereco_mac=?,"
                    + "setor_hospital=?,"
                    + "tipo_processador=?,"
                    + "tipo_sistema_operacional=?,"
                    + "tamanho_hd=?,tamanho_ram=?,"
                    + "cod_cliente WHERE ID = ?;");
        } else {
            comandoInsertOuUpdate = ("INSERT INTO computadores_gerais (id_computador, numero_ip, nome_computador, "
                    + "endereco_mac, setor_hospital, tipo_processador, tipo_sistema_operacional, tamanho_hd, "
                    + "tamanho_ram, cod_cliente)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        }

    }

    public void setIdComputador(int idComputador) {
        this.idComputador = idComputador;
    }

}
