package com.example.springboot.basics.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
	

	@GetMapping(value = {"/index", "/", "/home"}) //se encarga de mapear el endpoint
	public String index(){
		return "index"; //devuelve archivo index.html
	}
	
}
