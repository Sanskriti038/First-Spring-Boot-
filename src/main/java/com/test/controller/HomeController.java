package com.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public ResponseEntity<String> home(@RequestParam("number") int i) {
		System.out.println("Controller Called!");
		if(i==0) {
			return new ResponseEntity<String>("Not Define",HttpStatus.NOT_ACCEPTABLE);
		}else if(i%2==0) {
			return new ResponseEntity<String>("Even Number",HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Odd Number",HttpStatus.OK);
		}
		
	}
	
	
}
