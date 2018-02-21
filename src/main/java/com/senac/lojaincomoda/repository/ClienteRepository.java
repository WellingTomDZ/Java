package com.senac.lojaincomoda.repository;

import org.springframework.data.repository.CrudRepository;

import com.senac.lojaincomoda.domain.Cliente;

public interface ClienteRepository  extends CrudRepository<Cliente, Long>{
	
}