package com.br.microservice.simples.microservicesimples.gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    @NotNull(message = "Nome é obrigatorio")
    @NotEmpty(message = "Nome é obrigatorio")
    private String name;

    private Long id;

}
