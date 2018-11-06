package com.mycompany.sistemayum;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class YumConnection {

    private final String connectionUrl
            = "jdbc:sqlserver://juvencio007.database.windows.net:1433; "
            + "database=Juvencio;"
            + "user=juvenciojose;"
            + "password=1Jo2se345;"
            + "encrypt=true;"
            + "trustServerCertificate=false;"
            + "hostNameInCertificate=*.database.windows.net;"
            + "loginTimeout=60;";

    YumOshi yum = new YumOshi();
    private boolean resultado = false;

    private void enviarDados() {
        YumAPP x = new YumAPP();
        int y=0;
        try {
            System.out.println("x.i: "+x.i);
            while (x.i) {
                try {
                    // cria um preparedStatement
                    Connection connection = DriverManager.getConnection(connectionUrl);
                    PreparedStatement stmt = connection.prepareStatement("insert into computador (OS, HDTOTAL, RAMTOTAL, RAMDISPONIVEL) values (?, ?, ?, ?);");

                    // preenche os valores
                    stmt.setString(1, yum.getSistemaOperacional());
                    stmt.setString(2, yum.getHdTotal());
                    stmt.setString(3, yum.getRamTotal());
                    stmt.setString(4, yum.getRamDisponivel());
                    
                    // executa
                    stmt.execute();
                    stmt.close();
                    
                    System.out.println("Foi um "+ y++);
                } catch (SQLException e) {
                    System.out.println("InsertException: " + e);
                }
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            System.out.println("WhileException: " + e);
        }
    }

    public boolean logar(String email, String senha) {

        String comando = String.format("select * from usuario where email = '%s' and senha = '%s'", email, senha);
        System.out.println("comando: " + comando);
        try {
            Connection connection = DriverManager.getConnection(connectionUrl);

            Statement stmt;
            stmt = connection.createStatement();
            ResultSet results = stmt.executeQuery(comando);
            while (results.next()) {
                resultado = true;
            }
            results.close();
            stmt.close();
            System.out.println("result: " + results);
            System.out.println("resultado: "+ resultado);
            if (resultado) {
                enviarDados();
            }

            //resultado = results;
        } catch (SQLException ex) {
            System.out.println("SelectException: " + ex);
        }
        return resultado;
    }
}
