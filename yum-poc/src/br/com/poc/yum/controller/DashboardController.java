package br.com.poc.yum.controller;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

	@RequestMapping("/listas")
	public ModelAndView listas() {
		// do banco

		List<Integer> lista1 = Arrays.asList(65, 59, 20, 81, 56, 55, 40);
		List<Integer> lista2 = Arrays.asList(5, 9, 2, 8, 6, 5, 4);
		ModelAndView mv = new ModelAndView("grafico-direita");

		Map<String, List> listas = new HashMap<>();
		listas.put("lista1", lista1);
		listas.put("lista2", lista2);

		mv.addObject("listas", listas.toString().replace("=", ":"));

		return mv;
	}

	@RequestMapping("/dash2")
	public String dash2() {
		return "Dashboard2";
	}

}