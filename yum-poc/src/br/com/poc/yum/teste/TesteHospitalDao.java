package br.com.poc.yum.teste;

import br.com.poc.yum.dao.HospitalDao;
import br.com.poc.yum.modelos.Hospital;

public class TesteHospitalDao {

	public static void main(String[] args) throws ClassNotFoundException {
		Hospital hospital = new Hospital();
		
		hospital.setBairro("a");
		hospital.setCep("1234");
		hospital.setCidade("teste");
		hospital.setCnpj("1234");
		hospital.setEmailComercial("12345");
		hospital.setEstado("sp");
		hospital.setNome("teste");
		hospital.setNomeFantasia("teste");
		hospital.setNumero(1);
		hospital.setRua("teste");
		hospital.setSenha("1234");
		hospital.setTelefone("1234");
		
		HospitalDao dao = new HospitalDao();
		dao.adiciona(hospital);
		System.out.println("Foi ok");
		
	}

}
