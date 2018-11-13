package br.com.poc.yum.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.poc.yum.dao.ComputadorDao;
import br.com.poc.yum.jsonview.Views;
import br.com.poc.yum.modelos.AjaxResponseBody;
import br.com.poc.yum.modelos.Computador;

@RestController
public class AjaxController {
	List<Computador> computadores;	
	@JsonView(Views.Public.class)
	@RequestMapping(value = "/search/api/getSearchResult")
	public AjaxResponseBody getSearchResultViaAjax(@RequestBody Computador pc) throws ClassNotFoundException, SQLException {
		
		AjaxResponseBody result = new AjaxResponseBody();
		ComputadorDao dao = new ComputadorDao();
		List<Computador> computadores = dao.listaComputadores();
		if (computadores.size() > 0) {
			result.setCode("200");
			result.setMsg("");
			result.setResult(computadores);
			
		} else {
			result.setCode("400");
			result.setMsg("Este usuário não tem computadores");
		}
		return result;
		
	}
}
