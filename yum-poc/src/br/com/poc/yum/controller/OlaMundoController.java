package br.com.poc.yum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class OlaMundoController {
	@RequestMapping("/olaMundo")
	public String olaMundo() {
		System.out.println("Esta merda deu certo");
		return "Login";
	}
}
