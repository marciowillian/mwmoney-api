package com.mwcc.mwccmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mwcc.mwccmoney.api.model.Lancamento;
import com.mwcc.mwccmoney.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

}
