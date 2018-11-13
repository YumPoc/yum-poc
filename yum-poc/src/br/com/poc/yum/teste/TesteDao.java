package br.com.poc.yum.teste;

import java.sql.SQLException;

import br.com.poc.yum.dao.ComputadorDao;
import br.com.poc.yum.modelos.Computador;

public class TesteDao {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ComputadorDao dao = new ComputadorDao();
		
		for(Computador computador : dao.listaComputadores()) {
		System.out.println(computador.getNome());
		System.out.println(computador.getTipoProcessador());
		System.out.println(computador.getTamanhoHd());
		}
	}

}
