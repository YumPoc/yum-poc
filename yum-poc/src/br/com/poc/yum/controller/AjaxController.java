package br.com.poc.yum.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.poc.yum.dao.ComputadorDao;
import br.com.poc.yum.jsonview.Views;
import br.com.poc.yum.modelos.AjaxResponseBody;
import br.com.poc.yum.modelos.Computador;

@RestController
public class AjaxController {
	List<Computador> computadores;

	
	
	@RequestMapping(value = "/search/api/getInfoFixa",method = RequestMethod.POST)
	public @ResponseBody List<Computador> getSearchResultViaAjax(@RequestBody Computador pc)
			throws ClassNotFoundException, SQLException {

		
		ComputadorDao dao = new ComputadorDao();
		List<Computador> computadores = dao.listaComputadores();
		
		return null;
	}
}
