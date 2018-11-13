package daoyum;

import sistemayum.*;
import connectionyum.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ComputadorDao {

    private Connection conexao;
    private InfoGerais infoGerais = new InfoGerais();
    private InfoDinamicas infoDinamicas = new InfoDinamicas();
    private boolean resultado = false;
    private int id_cliente;
    public ComputadorDao() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().getConnection();
    }
    //Adiciona informacoes Gerais no Banco De Dados
    private void adiciona(InfoGerais gerais) {
        gerais.AtualizarInfoGerais();
        String insertComputadores = "INSERT INTO computadores_gerais (id_computador, numero_ip, nome_computador, "
                + "endereco_mac, setor_hospital, tipo_processador, tipo_sistema_operacional, tamanho_hd, "
                + "tamanho_ram, cod_cliente)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";//Ta dando problema em inserir o CodClient   
        try {
            PreparedStatement insertComputador = conexao.prepareStatement(insertComputadores);
            //seta ps valores
            insertComputador.setInt(1, gerais.getIdComputador());
            insertComputador.setString(2, gerais.getNumeroIp());
            insertComputador.setString(3, gerais.getNomeComputador());
            insertComputador.setString(4, gerais.getEnderecoMac());
            insertComputador.setString(5, gerais.getSetorHospital());
            insertComputador.setString(6, gerais.getTipoProcessador());
            insertComputador.setString(7, gerais.getSistemaOperacional());
            insertComputador.setString(8, gerais.getTamanhoHd());
            insertComputador.setString(9, gerais.getTamanhoRam());
            insertComputador.setInt(10, id_cliente);//Ta dando problema em inserir o CodClient   

            System.out.println(insertComputador.toString());
            insertComputador.execute();
            insertComputador.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //Adiciona informacoes Dinamicas no Banco De Dados
    private void adiciona(InfoDinamicas dinamicas){
        //Fazer o mesmo que foi feito com a adicionar infoGerais,Só que para a tabela de info Dinamicas
    }


    public boolean logar(String email, String senha) {

        //String comando = "select id_cliente from cadastro_cliente where email_contato = '"+email+"' and senha = '"+senha+"';";
        String comando = "select id_cliente from cadastro_cliente where email_contato = ? and senha = ?;";

        try {
            PreparedStatement selectCliente = conexao.prepareStatement(comando);
            selectCliente.setString(1, email);
            selectCliente.setString(2, senha);

            //boolean execute = selectCliente.execute();//linha não usada
            
            System.out.println("comando sql: " + comando);
            
            ResultSet executeQuery = selectCliente.executeQuery();
            
            //boolean next = executeQuery.next();
            while (executeQuery.next()) {
                id_cliente = executeQuery.getInt("id_cliente");
                System.out.println("id_cliente: "+id_cliente);
                adiciona(infoGerais);
                setResultado(true);
            }
            selectCliente.close();

        } catch (SQLException ex) {
            Logger.getLogger(ComputadorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean isResultado() {
        return resultado;
    }

    private void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    private int getId_cliente() {
        System.out.println("GET COD CLIENT FACTORY: " + id_cliente);
        return id_cliente;
    }

    private void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

}
