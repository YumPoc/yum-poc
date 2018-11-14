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
    private boolean resultado = false;
    private int idCliente;
    private int idComputador;
    private String comandoInsertUpdate;

    public ComputadorDao() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().getConnection();
    }

    //Adiciona informacoes Dinamicas no Banco De Dados
    private void adiciona(InfoDinamicas dinamicas) {
        //Fazer o mesmo que foi feito com a adicionar infoGerais,Só que para a tabela de info Dinamicas
    }

    //Adiciona as informações no banco
    private void adiciona(InfoGerais gerais) {
        gerais.AtualizarInfoGerais();

        try {
            PreparedStatement computadorGeral = conexao.prepareStatement(comandoInsertUpdate);

            //seta ps valores
            computadorGeral.setInt(1, gerais.getIdComputador());
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
            throw new RuntimeException(e);
        }
    }

    //Verificar se o ID do computador já existe ou não no banco
    public boolean verificarComputador(int patrimonio) {
        String comando = "select id_computador from computadores_gerais where id = ?;";

        PreparedStatement selectComputador;
        try {

            selectComputador = conexao.prepareStatement(comando);
            selectComputador.setInt(1, patrimonio);

            ResultSet execteQuery = selectComputador.executeQuery();

            while (execteQuery.next()) {
                idComputador = execteQuery.getInt("id_computador");
                resultado = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ComputadorDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        comandoAdicionaOuAtualiza(resultado);
        adiciona(infoGerais);
        return resultado;
    }

    //Verificar se o usuario existe
    public boolean logar(String email, String senha) {

        //String comando = "select id_cliente from cadastro_cliente where email_contato = '"+email+"' and senha = '"+senha+"';";
        String comando = "select id_cliente from cadastro_cliente where email_contato = ? and senha = ?;";

        try {
            PreparedStatement selectCliente = conexao.prepareStatement(comando);
            selectCliente.setString(1, email);
            selectCliente.setString(2, senha);

            ResultSet executeQuery = selectCliente.executeQuery();

            while (executeQuery.next()) {
                idCliente = executeQuery.getInt("id_cliente");
                System.out.println("id_cliente: " + idCliente);
                //adiciona(infoGerais);
                resultado = true;
            }
            selectCliente.close();

        } catch (SQLException ex) {
            Logger.getLogger(ComputadorDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;

    }

    public String comandoAdicionaOuAtualiza(boolean existe) {
        if (existe) {
            comandoInsertUpdate = ("UPDATE computadores_gerais SET "
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
            comandoInsertUpdate = ("INSERT INTO computadores_gerais (id_computador, numero_ip, nome_computador, "
                    + "endereco_mac, setor_hospital, tipo_processador, tipo_sistema_operacional, tamanho_hd, "
                    + "tamanho_ram, cod_cliente)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        }
        return comandoInsertUpdate;
    }

    private int getIdCliente() {
        return idCliente;
    }

    public int getIdComputador() {
        return idComputador;
    }

}
