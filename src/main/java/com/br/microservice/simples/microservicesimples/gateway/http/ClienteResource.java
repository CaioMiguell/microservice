package com.br.microservice.simples.microservicesimples.gateway.http;

import com.br.microservice.simples.microservicesimples.domain.Cliente;
import com.br.microservice.simples.microservicesimples.gateway.dto.ClienteDTO;
import com.br.microservice.simples.microservicesimples.gateway.repository.ClienteRepository;
import com.br.microservice.simples.microservicesimples.service.CreateClienteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@Log4j2
public class ClienteResource {

    @Autowired
    private CreateClienteService createClienteService;

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/nome")
    public void setCliente(@Valid @RequestBody ClienteDTO clientedto){
        log.info("Nome do cliente é " + clientedto.getName());

        createClienteService.execute(Cliente
                .builder()
                .name(clientedto.getName())
                .build());
    }

    @GetMapping("/cliente")
    public ClienteDTO getCliente(){
        return ClienteDTO
                .builder()
                .id(1L)
                .name("Test")
                .build();
    }

    @GetMapping("meus/clientes")
    public List<ClienteDTO> Clientes(){

        List<ClienteDTO> mClientes = new ArrayList<>();

        Iterable<Cliente> all = clienteRepository.findAll();
        all.forEach(cliente -> mClientes.add(ClienteDTO
                .builder()
                .id(cliente.getId())
                .name(cliente.getName())
                .build()));
        return mClientes;
    }
}
