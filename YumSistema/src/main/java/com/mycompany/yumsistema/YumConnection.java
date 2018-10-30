package com.mycompany.yumsistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class YumConnection {

    String hostName = "your_server.database.windows.net";
    String dbName = "your_database";
    String user = "your_username";
    String password = "your_password";
    String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
    Connection connection = null;

    YumOS OS = new YumOS();
    
    public String method(){
        
        try {
            connection = DriverManager.getConnection(url);

            // Create and execute a INSERT SQL statement.
            String INSERTSql = String.format("INSERT INTO {your_table} {(your_colum)} VALUES ('%s')",OS.getSistemaOperacional());
            Statement statement = connection.createStatement();
            statement.execute(INSERTSql);
            connection.close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return OS.getSistemaOperacional();
    }

}

