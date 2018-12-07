package br.com.poc.yum.teste;

import java.sql.SQLException;

import br.com.poc.yum.dao.ComputadorDao;
import br.com.poc.yum.modelos.Computador;

public class TesteDao {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ComputadorDao dao = new ComputadorDao();

		Computador computador = new Computador();
		computador.setIdComputador(12);

		computador = dao.selecionaComputador(computador);
		System.out.println(computador.getNome());
		System.out.println(computador.getUsoCpuMaxima());
		System.out.println(computador.getUsoCpuMinima());
		System.out.println(computador.getUsoCpuMedia());

	}

}
