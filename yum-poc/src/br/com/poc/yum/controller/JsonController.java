package br.com.poc.yum.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.poc.yum.dao.ComputadorDao;
import br.com.poc.yum.modelos.Computador;
import br.com.poc.yum.modelos.ComputadorDinamico;
@Controller
@RequestMapping("/computador/dinamica")
public class JsonController {
	@RequestMapping(value="{id}", method = RequestMethod.GET)
	public @ResponseBody ComputadorDinamico getComputadorDinamico(@PathVariable int id) throws ClassNotFoundException, SQLException {
		
		Computador computador = new Computador();
		ComputadorDinamico dinamico = new ComputadorDinamico();
		computador.setIdComputador(id);
		ComputadorDao dao = new ComputadorDao();
		dinamico = dao.gerarComputadorDinamicos(computador);
			
		return dinamico;

	}

}
