package com.mariaalicia.pessoasapi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoaJuridica") // endpoint
public class PessoaJuridica {
	
	@PostMapping
	public ResponseEntity<String> pegarNome(){
		return new ResponseEntity<>("retorne ", HttpStatus.OK); 
	}

}
