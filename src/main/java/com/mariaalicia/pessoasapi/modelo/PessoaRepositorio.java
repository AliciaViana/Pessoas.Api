package com.mariaalicia.pessoasapi.modelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mariaalicia.pessoasapi.entidade.Pessoa;
@Repository
public interface PessoaRepositorio extends JpaRepository<Pessoa, Integer>{

}
