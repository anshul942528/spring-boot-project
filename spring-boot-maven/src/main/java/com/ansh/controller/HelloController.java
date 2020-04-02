package com.ansh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class HelloController {
	
	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public String greetings() {
		log.info("Hello controller, greet method");
		return "Hello World";
	}
}
