package com.home.algamoney.repository.lancamento;

import java.util.List;

import com.home.algamoney.model.Lancamento;
import com.home.algamoney.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);

}
