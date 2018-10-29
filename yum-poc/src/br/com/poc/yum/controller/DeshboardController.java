package br.com.poc.yum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeshboardController {
	@RequestMapping("/deshboard")
	public String deshboardPagina() {
		return "index";
	}
}