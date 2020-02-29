package com.mwcc.mwccmoney.api.repository.lancamento;

import java.util.List;

import com.mwcc.mwccmoney.api.model.Lancamento;
import com.mwcc.mwccmoney.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
}
