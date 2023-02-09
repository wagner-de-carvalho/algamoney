package com.home.algamoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.algamoney.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}

