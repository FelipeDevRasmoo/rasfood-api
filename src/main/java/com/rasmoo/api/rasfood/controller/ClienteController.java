package com.rasmoo.api.rasfood.controller;

import com.rasmoo.api.rasfood.entity.Cliente;
import com.rasmoo.api.rasfood.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/cliente")
@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    private ResponseEntity<List<Cliente>> consultarTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(clienteRepository.findAll());
    }
}
