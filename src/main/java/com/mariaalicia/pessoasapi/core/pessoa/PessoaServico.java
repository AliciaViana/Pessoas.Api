package com.mariaalicia.pessoasapi.core.pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PessoaServico {
	@Autowired PessoaRepositorio pessoaRepositorio;

	public String salvarPessoa(PessoaDTO pessoaDTO) {
		Pessoa pessoa = new Pessoa();
		if (pessoaDTO.getNome().isEmpty()) {
			return "o campo esta vazio";

		}
		if (pessoaDTO.getIdade() == 0) {
			return "o campo idade esta vazio";
		}
		pessoa.setNome(pessoaDTO.getNome());
		pessoa.setIdade(pessoaDTO.getIdade());
		pessoaRepositorio.save(pessoa);

		return "O usuário " + pessoaDTO.getNome() + " foi salvo no banco de dados";

	}
	
	public String carregaCargo(PessoaDTO pessoaDTO) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(pessoaDTO.getNome());
		pessoa.setIdade(pessoaDTO.getIdade());
		pessoa.setCargo(pessoaDTO.getCargo());
		return "o cargo é: " + pessoaRepositorio.save(pessoa).getCargo();
	}
}
