package br.com.poc.yum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class OlaMundoController {
	@RequestMapping("/")
	public String olaMundo() {
		System.out.println("http://localhost:8080/yum-poc/ sem prescisar de index");
		return "index"; 
	}
}
