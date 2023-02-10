package com.home.algamoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.algamoney.model.Lancamento;
import com.home.algamoney.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}

