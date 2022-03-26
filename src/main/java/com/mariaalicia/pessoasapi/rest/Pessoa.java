package com.mariaalicia.pessoasapi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class Pessoa {

	@PostMapping
	public ResponseEntity<String> pegarNome(@RequestBody String nome){
		return new ResponseEntity<>(nome, HttpStatus.OK);
	}
}
