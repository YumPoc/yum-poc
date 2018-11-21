package br.com.poc.yum.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.poc.yum.dao.HospitalDao;
import br.com.poc.yum.modelos.Hospital;

@Controller
public class HospitalController {
	@RequestMapping("/cadastro")
	public String cadastroHospital() {
		return "Cadastro";
	}

	@RequestMapping(value = "sucesso-cadastro", method = RequestMethod.POST)
	public String adiciona(Hospital hospital) throws ClassNotFoundException {
		HospitalDao dao = new HospitalDao();
		dao.adiciona(hospital);
		return "redirect:login";
	}

	@RequestMapping("/login")
	public String loginPagina() {
		return "Login";

	}

	@RequestMapping(value = "loginEfetuado", method = RequestMethod.GET)
	public String verificar(Hospital hospital, HttpSession session) throws ClassNotFoundException {

		HospitalDao dao = new HospitalDao();

		if (dao.verificar(hospital) != 0) {
			session.setAttribute("idUsuario", hospital);
			return "redirect:dashboard";
		} else {
			return "redirect:login";
		}

	}

	@RequestMapping("/index")
	public String menu() {
		return "index";
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:index";
	}
	@RequestMapping("/teste")
	public int teste() {
		return 10;
	}
}
