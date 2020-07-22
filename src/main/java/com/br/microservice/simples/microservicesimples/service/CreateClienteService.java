package com.br.microservice.simples.microservicesimples.service;

import com.br.microservice.simples.microservicesimples.domain.Cliente;
import com.br.microservice.simples.microservicesimples.gateway.repository.ClienteRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class CreateClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void execute(Cliente cliente){
        log.info("Gravando cliente no banco. ");

        clienteRepository.save(cliente);

        log.info("Cliente gravado com o ID = " + cliente.getId());
    }
}
