package br.com.poc.yum.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.poc.yum.dao.ComputadorDao;
import br.com.poc.yum.modelos.Computador;
import br.com.poc.yum.modelos.Hospital;

@Controller
public class DashboardController {
	@RequestMapping("/dashboard")
	public ModelAndView dashboardPagina(Hospital hospital, HttpSession session) throws ClassNotFoundException, SQLException {
		hospital = (Hospital) session.getAttribute("idUsuario");
		ComputadorDao dao = new ComputadorDao();
		List<Computador> computadores = dao.listaComputadoresGerais(hospital);
		
		ModelAndView mv = new ModelAndView("Dashboard");
		mv.addObject("computadores",computadores);
		return mv;
	}



	
	@RequestMapping(value="relatorio/{id}", method = RequestMethod.GET)
	public ModelAndView relatorio(@PathVariable int id) throws ClassNotFoundException, SQLException {
		Computador computador = new Computador();
		computador.setIdComputador(id);
		System.out.println(computador.getIdComputador());
		ComputadorDao dao = new ComputadorDao();
		dao.selecionaComputador(computador);
		ModelAndView mv = new ModelAndView("Relatorios");
		mv.addObject("computador",computador);
		return mv;
	}

}