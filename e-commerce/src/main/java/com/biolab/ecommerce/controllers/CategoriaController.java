package com.biolab.ecommerce.controllers;

import com.biolab.ecommerce.DTOs.CategoriaDTO;
import com.biolab.ecommerce.entities.Categoria;
import com.biolab.ecommerce.services.CategoriaServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("categoria")
public class CategoriaController {
    private final CategoriaServices service;
    public CategoriaController(CategoriaServices service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> criarCat(@RequestBody CategoriaDTO dto){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.criarCategoria(dto));
    }

    @GetMapping ("/{id}")
    public ResponseEntity<?> buscarCat(@PathVariable long id){
        return ResponseEntity.ok().body(service.buscarCatId(id));
    }
    @GetMapping
    public ResponseEntity<?> mostrarCategoria(){
        return ResponseEntity.ok().body(service.mostrarCategoria());
    }//xxx

    @PutMapping("/{id}")
    public ResponseEntity<?> alterarCat(
            @PathVariable long id, @RequestBody CategoriaDTO dto){
        return ResponseEntity.ok().body(service.alterar(id, dto));
    }//xxx

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarCat(@PathVariable long id){
        return ResponseEntity.ok().body(service.delete(id));
    }
}
