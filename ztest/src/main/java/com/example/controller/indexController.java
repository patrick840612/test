package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
public class indexController {
	
	
	@RequestMapping("/")
	public String index() {
		System.out.println("index 요청");
		return "index";
	}
	

	
}
