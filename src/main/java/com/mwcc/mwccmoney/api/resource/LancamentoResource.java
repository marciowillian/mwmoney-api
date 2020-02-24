package com.mwcc.mwccmoney.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mwcc.mwccmoney.api.model.Lancamento;
import com.mwcc.mwccmoney.api.repository.LancamentoRepository;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoResource {
	
	@Autowired
	private LancamentoRepository lancamentoRepository;

	@GetMapping
	public List<Lancamento> findAll(){
		return lancamentoRepository.findAll();
	}
	
}
