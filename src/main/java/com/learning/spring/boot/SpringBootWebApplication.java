package com.learning.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@ServletComponentScan
public class SpringBootWebApplication {

	@RequestMapping ("/thymeleaf")
	public String tleaf () {
		return "template";
	}
	
	@RequestMapping ("/mustache")
	public String mustache (Model model) {
		model.addAttribute("FirstName", "Kevin");
		model.addAttribute("LastName", "Bowersox");
		
		return "template";
	}
	
	@RequestMapping ("/viewresolver")
	public String viewResolver () {
		return "viewresolver";
	}
	
	@RequestMapping ("/cat")
	@ResponseBody
	public Cat cat () {
		return new Cat ("Athena", "Bengal", 1);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}
}
