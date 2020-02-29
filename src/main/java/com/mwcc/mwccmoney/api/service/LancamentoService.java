package com.mwcc.mwccmoney.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mwcc.mwccmoney.api.model.Lancamento;
import com.mwcc.mwccmoney.api.model.Pessoa;
import com.mwcc.mwccmoney.api.repository.LancamentoRepository;
import com.mwcc.mwccmoney.api.repository.PessoaRepository;
import com.mwcc.mwccmoney.api.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public Lancamento salvar(Lancamento lancamento) throws PessoaInexistenteOuInativaException {
		Pessoa pessoa = pessoaRepository.findByCodigo(lancamento.getPessoa().getCodigo());
		if(pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		return lancamentoRepository.save(lancamento);
	}
	
}
