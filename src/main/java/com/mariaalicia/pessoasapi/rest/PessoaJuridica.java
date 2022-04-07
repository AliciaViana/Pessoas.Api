package com.mariaalicia.pessoasapi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mariaalicia.pessoasapi.dto.PessoaDTO;
import com.mariaalicia.pessoasapi.entidade.Pessoa;
import com.mariaalicia.pessoasapi.modelo.PessoaRepositorio;
import com.mariaalicia.pessoasapi.servico.PessoaServico;

@RestController
@RequestMapping("/pessoaJuridica")
public class PessoaJuridica {
	
	@PostMapping
	public ResponseEntity<String> pegarCargo(){
		return new ResponseEntity<>("o cargo é", HttpStatus.OK); 
	}

}
