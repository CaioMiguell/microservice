package com.br.microservice.simples.microservicesimples.gateway.http;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class StatusResource {

    @GetMapping("/status")
    @ResponseBody
    public String status(){

        return "OK";
    }


}
