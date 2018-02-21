package com.senac.lojaincomoda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.senac.lojaincomoda.domain.Pagamento;
import com.senac.lojaincomoda.repository.PagamentoRepository;

@Controller
@RequestMapping(path="/pagamento")
public class PagamentoController {
	
	@Autowired
	private PagamentoRepository repository;

	@GetMapping()
	public @ResponseBody Iterable<Pagamento> all() {
		return repository.findAll();
	}
	
	@PostMapping()
	public @ResponseBody String add(@RequestBody Pagamento pagamento) {
		repository.save(pagamento);
		return "Saved";
	}
	
	@DeleteMapping(path="/{id}")
	public @ResponseBody String remove(@PathVariable int id) {
		repository.delete(id);
		return "Removed";
	}
	
	@GetMapping(path="/{id}")
	public ResponseEntity<Pagamento> findById(@PathVariable int id) {
		Pagamento pagamento = repository.findOne(id);
		return new ResponseEntity<Pagamento>(pagamento, HttpStatus.CREATED);
	}
	
	@PutMapping()
	public ResponseEntity<Pagamento> update(@RequestBody Pagamento pagamento) {
		repository.save(pagamento);
		return new ResponseEntity<Pagamento>(pagamento, HttpStatus.ACCEPTED);
	}
}
