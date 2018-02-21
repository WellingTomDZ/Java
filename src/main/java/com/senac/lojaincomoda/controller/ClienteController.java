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

import com.senac.lojaincomoda.domain.Cliente;
import com.senac.lojaincomoda.repository.ClienteRepository;

@Controller
@RequestMapping(path="/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;

	@GetMapping()
	public @ResponseBody Iterable<Cliente> all() {
		return repository.findAll();
	}
	
	@PostMapping()
	public @ResponseBody String add(@RequestBody Cliente cliente) {
		repository.save(cliente);
		return "Saved";
	}
	
	@DeleteMapping(path="/{id}")
	public @ResponseBody String remove(@PathVariable long id) {
		repository.delete(id);
		return "Removed";
	}
	
	@GetMapping(path="/{id}")
	public ResponseEntity<Cliente> findById(@PathVariable long id) {
		Cliente cliente = repository.findOne(id);
		return new ResponseEntity<Cliente>(cliente, HttpStatus.CREATED);
	}
	
	@PutMapping()
	public ResponseEntity<Cliente> update(@RequestBody Cliente cliente) {
		repository.save(cliente);
		return new ResponseEntity<Cliente>(cliente, HttpStatus.ACCEPTED);
	}
}
