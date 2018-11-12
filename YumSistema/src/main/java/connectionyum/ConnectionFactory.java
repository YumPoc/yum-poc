package connectionyum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {

    public Connection getConnection() throws ClassNotFoundException {

        String connectionUrl
                = "jdbc:sqlserver://guilherme-faria.database.windows.net:1433;"
                + "database=yum_poc;"
                + "user=guigafaria@guilherme-faria;password=Abcd@123;"
                + "encrypt=true;trustServerCertificate=false;"
                + "hostNameInCertificate=*.database.windows.net;";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean resultado = false;
    private int id_cliente;
    
    public boolean logar(String email, String senha) throws ClassNotFoundException {

        String comando = String.format("select id_cliente from cadastro_cliente where email_contato = '%s' and senha = '%s'", email, senha);
        System.out.println("comando: " + comando);
        try {
            Connection connection = getConnection();

            Statement stmt;
            stmt = connection.createStatement();
            ResultSet results = stmt.executeQuery(comando);
            while (results.next()) {
                setResultado(true);
                setId_cliente(results.getInt("id_cliente"));
            }
            results.close();
            stmt.close();
            System.out.println("result: " + results);
            System.out.println("resultado: " + resultado);
            if (resultado) {

                //enviarDados();
            }

            //resultado = results;
        } catch (SQLException ex) {
            System.out.println("SelectException: " + ex);
        }
        return resultado;
    }

    public boolean isResultado() {
        return resultado;
    }

    private void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public int getId_cliente() {
        System.out.println("GET COD CLIENT FACTORY: "+id_cliente);
        return id_cliente;
    }

    private void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
}
