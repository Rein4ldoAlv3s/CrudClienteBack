package com.reinaldo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reinaldo.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
