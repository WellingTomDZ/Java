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

import com.senac.lojaincomoda.domain.ItemPedido;
import com.senac.lojaincomoda.repository.ItemPedidoRepository;

@Controller
@RequestMapping(path="/itemPedido")
public class ItemPedidoController {
	
	@Autowired
	private ItemPedidoRepository repository;

	@GetMapping()
	public @ResponseBody Iterable<ItemPedido> all() {
		return repository.findAll();
	}
	
	@PostMapping()
	public @ResponseBody String add(@RequestBody ItemPedido itemPedido) {
		repository.save(itemPedido);
		return "Saved";
	}
	
	@DeleteMapping(path="/{id}")
	public @ResponseBody String remove(@PathVariable long id) {
		repository.delete(id);
		return "Removed";
	}
	
	@GetMapping(path="/{id}")
	public ResponseEntity<ItemPedido> findById(@PathVariable long id) {
		ItemPedido itemPedido = repository.findOne(id);
		return new ResponseEntity<ItemPedido>(itemPedido, HttpStatus.CREATED);
	}
	
	@PutMapping()
	public ResponseEntity<ItemPedido> update(@RequestBody ItemPedido itemPedido) {
		repository.save(itemPedido);
		return new ResponseEntity<ItemPedido>(itemPedido, HttpStatus.ACCEPTED);
	}
}
