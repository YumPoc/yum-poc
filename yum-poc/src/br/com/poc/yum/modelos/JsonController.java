package br.com.poc.yum.modelos;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.poc.yum.dao.ComputadorDao;
@Controller
@RequestMapping("/computador/dinamica")
public class JsonController {
	@RequestMapping(value="{id}", method = RequestMethod.GET)
	public @ResponseBody Computador getShopInJSON(@PathVariable int id) throws ClassNotFoundException, SQLException {
		
		Computador computador = new Computador();
		computador.setIdComputador(id);
		ComputadorDao dao = new ComputadorDao();
		dao.gerarComputadorDinamicos(computador);
			
		
		
		return computador;

	}

}
