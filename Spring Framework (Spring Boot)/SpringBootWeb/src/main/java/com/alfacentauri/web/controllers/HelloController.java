package com.alfacentauri.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	@ResponseBody // Imprimira un resultado debes de una vista
	public String hello(@RequestParam String name) { // Parametros por GET
		return "hello "+name;
	}
	
}
