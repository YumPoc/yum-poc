package br.com.poc.yum.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
		String connectionUrl = "jdbc:sqlserver://guilherme-faria.database.windows.net:1433;Database=yum_poc;user=guigafaria@guilherme-faria;Password=Abcd@123;Encrypt=True;TrustServerCertificate=true;hostNameInCertificate=guilherme-faria.database.windows.net;Connection Timeout=30;";
		
		public Connection getConnection() {
			try {
				return DriverManager.getConnection(connectionUrl);
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			
		}
	}

