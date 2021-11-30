package com.logs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.ModuleLayer.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class controller {
	
	private final static Logger Logger= LoggerFactory.getLogger(Controller.class);
	
	@GetMapping("/")
	public ResponseEntity<String> index()
	{
		Logger.info("Llamada al endpoint inicial.");
		return new ResponseEntity<String>(HttpStatus.OK).ok("hola");
	}
}
