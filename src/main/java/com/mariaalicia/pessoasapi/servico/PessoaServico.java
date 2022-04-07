package com.mariaalicia.pessoasapi.servico;

import org.springframework.stereotype.Service;

import com.mariaalicia.pessoasapi.dto.PessoaDTO;
import com.mariaalicia.pessoasapi.entidade.Pessoa;
import com.mariaalicia.pessoasapi.modelo.PessoaRepositorio;

@Service public class PessoaServico {
    final PessoaRepositorio pessoaRepositorio;

    public PessoaServico(PessoaRepositorio pessoaRepositorio) {
        this.pessoaRepositorio = pessoaRepositorio;
    }

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
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(pessoaDTO.getNome());
        pessoa.setIdade(pessoaDTO.getIdade());
        pessoa.setCargo(pessoaDTO.getCargo());
        return "o cargo é: " + pessoaRepositorio.save(pessoa).getCargo();
    }
}
