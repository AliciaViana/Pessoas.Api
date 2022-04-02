package com.mariaalicia.pessoasapi.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariaalicia.pessoasapi.dto.PessoaDTO;
import com.mariaalicia.pessoasapi.entidade.Pessoa;
import com.mariaalicia.pessoasapi.modelo.PessoaRepositorio;

@Service // signifca uma anotacao, gerencia
public class PessoaServico {
	private static final Object Pessoa = null;
	@Autowired
	PessoaRepositorio pessoaRepositorio;

	public String carregaNome(PessoaDTO pessoaDTO) {

		Pessoa pessoa = new Pessoa();

		if (pessoaDTO.getNome().isEmpty()) {
			return "o campo esta vazio";

		}
		if (pessoaDTO.getIdade() == 0) {
			return "o campo idade esta vazio";
		}
		pessoa.setNome(pessoaDTO.getNome());
		pessoa.setIdade(pessoaDTO.getIdade());

		return "o seu id é " + pessoaRepositorio.save(pessoa).getId();

	}
	public String carregaCargo(PessoaDTO pessoaDTO) {
		return "o cargo é: " + pessoaRepositorio.save(Pessoa).getCargo();
		
		
		
	}
}