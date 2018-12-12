package br.com.poc.yum.teste;

import java.sql.SQLException;

import br.com.poc.yum.dao.ComputadorDao;
import br.com.poc.yum.modelos.Computador;
import br.com.poc.yum.modelos.ComputadorDinamico;

public class TesteDao {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ComputadorDao dao = new ComputadorDao();

		Computador computador = new Computador();
		computador.setIdComputador(12);
		ComputadorDinamico dinamico = new ComputadorDinamico();
		dinamico = dao.gerarComputadorDinamicos(computador);

		System.out.println(dinamico.getUsoRam());
		

	}

}
