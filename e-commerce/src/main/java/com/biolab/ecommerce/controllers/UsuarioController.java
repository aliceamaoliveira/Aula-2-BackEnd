package com.biolab.ecommerce.controllers;

import com.biolab.ecommerce.DTOs.UsuarioDTO;
import com.biolab.ecommerce.entities.Pedido;
import com.biolab.ecommerce.services.UsuarioServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    private final UsuarioServices service;
    public UsuarioController(UsuarioServices service) {
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody UsuarioDTO dto) {
        return ResponseEntity.ok(service.criar(dto));
    }
}
