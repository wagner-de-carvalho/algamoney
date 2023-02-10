package com.home.algamoney.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.algamoney.api.service.exception.PessoaInexistenteOuInativaException;
import com.home.algamoney.model.Lancamento;
import com.home.algamoney.model.Pessoa;
import com.home.algamoney.repository.LancamentoRepository;
import com.home.algamoney.repository.PessoaRepository;

import jakarta.validation.Valid;

@Service
public class LancamentoService {

	@Autowired
	private PessoaRepository pessoaRepository;

	@Autowired
	private LancamentoRepository lancamentoRepository;

	public Lancamento salvar(@Valid Lancamento lancamento) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo());

		if (pessoa.isEmpty() || pessoa.get().isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}

		return lancamentoRepository.save(lancamento);
	}

}
