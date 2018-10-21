package br.com.poc.yum.teste;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.poc.yum.ConnectionFactory;

public class TesteConnectionFactory {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ConnectionFactory con = new ConnectionFactory();
		
		String sql = "select * from Pacotes";
		try {
			PreparedStatement stmt = con.getConnection().prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				System.out.println(rs.getInt("ID_Pacote"));
				System.out.println(rs.getString("Tipo_Pacote"));
			}else{
				System.out.println("Deu ruim");
			}
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			con.getConnection().close();
		}
	}
}