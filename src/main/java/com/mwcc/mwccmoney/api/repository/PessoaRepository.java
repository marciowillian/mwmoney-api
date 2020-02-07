package com.mwcc.mwccmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mwcc.mwccmoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
