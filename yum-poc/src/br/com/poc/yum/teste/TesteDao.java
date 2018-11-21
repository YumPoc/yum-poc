package br.com.poc.yum.teste;

import java.sql.SQLException;

import br.com.poc.yum.dao.ComputadorDao;
import br.com.poc.yum.modelos.Computador;
import br.com.poc.yum.modelos.Hospital;

public class TesteDao {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ComputadorDao dao = new ComputadorDao();
		Hospital hospital = new Hospital();
		hospital.setIdHospital(6);
		for (Computador computador : dao.listaComputadoresGerais(hospital)) {
			System.out.println(computador.getIdComputador());
		}
	}

}
