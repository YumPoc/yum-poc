package com.mycompany.yumsistema;

import com.mycompany.yumsistema.jdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class YumConnection {
    private Connection conexao;
    public YumConnection() throws ClassNotFoundException{
        this.conexao = new ConnectionFactory().getConnection();
    }
    YumOS OS = new YumOS();
    
    public String method(){
        
        try {
            // Create and execute a INSERT SQL statement.
            String INSERTSql = String.format("INSERT INTO {your_table} {(your_colum)} VALUES ('%s')",OS.getSistemaOperacional());
            Statement statement = conexao.createStatement();
            statement.execute(INSERTSql);
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return OS.getSistemaOperacional();
    }

}

