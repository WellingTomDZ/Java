package com.senac.lojaincomoda.repository;

import org.springframework.data.repository.CrudRepository;

import com.senac.lojaincomoda.domain.Pagamento;

public interface PagamentoRepository  extends CrudRepository<Pagamento, Integer>{
	
}