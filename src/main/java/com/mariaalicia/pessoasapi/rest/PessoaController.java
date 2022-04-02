
package com.mariaalicia.pessoasapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mariaalicia.pessoasapi.dto.PessoaDTO;
import com.mariaalicia.pessoasapi.servico.PessoaServico;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	@Autowired 
	PessoaServico pessoaServico;

	@PostMapping
	public ResponseEntity<String> pegarNome(@RequestBody PessoaDTO pessoaDTO) {
		return new ResponseEntity<>(pessoaServico.carregaNome(pessoaDTO), HttpStatus.OK);
	}
	

}
