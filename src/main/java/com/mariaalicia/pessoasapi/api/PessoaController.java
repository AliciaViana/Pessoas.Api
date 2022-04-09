package com.mariaalicia.pessoasapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mariaalicia.pessoasapi.core.pessoa.PessoaDTO;
import com.mariaalicia.pessoasapi.core.pessoa.PessoaServico;


@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	@Autowired PessoaServico pessoaServico;
	
	@PostMapping("/salvar")
	public ResponseEntity<String> salvarPessoa(@RequestBody PessoaDTO pessoaDTO) {
		return new ResponseEntity<>(pessoaServico.salvarPessoa(pessoaDTO), HttpStatus.OK);
	}

}
