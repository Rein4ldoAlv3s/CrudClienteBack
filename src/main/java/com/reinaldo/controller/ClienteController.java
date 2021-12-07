package com.reinaldo.controller;

import java.util.List;
import org.springframework.http.HttpStatus;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.reinaldo.model.Cliente;
import com.reinaldo.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
@CrossOrigin("*")
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> listar(){
		return clienteRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente salvar(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
		return cliente;
	}
	
}
