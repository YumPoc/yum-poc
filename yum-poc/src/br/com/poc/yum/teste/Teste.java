package br.com.poc.yum.teste;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Teste {

	public static void main(String[] args) {
		ConnectionFactory con = new ConnectionFactory();
		String sql ="select nome from teste where nome=?";
		try {
			PreparedStatement stmt = con.getConnection().prepareStatement(sql);
			stmt.setString(1, "bca");
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				System.out.println(rs.getString(1));
			}else{
				System.out.println("Deu ruim");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
