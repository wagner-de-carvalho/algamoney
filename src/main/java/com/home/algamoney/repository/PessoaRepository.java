package com.home.algamoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.algamoney.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
