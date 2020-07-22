package com.br.microservice.simples.microservicesimples.gateway.repository;

import com.br.microservice.simples.microservicesimples.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
