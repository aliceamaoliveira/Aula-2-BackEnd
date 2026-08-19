package com.biolab.restaurante.controllers;

import com.biolab.restaurante.DTOs.PratoRequest;
import com.biolab.restaurante.DTOs.PratoResponse;
import com.biolab.restaurante.Services.PratoServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("prato")
public class PratoController {

    private final PratoServices pratoService;

    public PratoController(PratoServices pratoServices) {
        this.pratoService = pratoServices;
    }

    //Para cadastrar um novo prato;
    @PostMapping
    public ResponseEntity<?> criarPrato(@RequestBody PratoRequest req) {
        return ResponseEntity.ok(
                "Criado com sucesso" + pratoService.criarPrato(req)
        );
    }

    //Para mostrar os pratos cadastrados;
    @GetMapping
    public ResponseEntity<List<PratoResponse>> mostrar() {
        return ResponseEntity.ok(pratoService.mostrarPratos());
    }

    //Para pesquisar o prato pelo id
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPrato(@PathVariable Long id) {
        return ResponseEntity.ok(pratoService.buscarID(id));
    }

    //Para apagar um prato específico, usando o seu Id
    @DeleteMapping("/{id}")
    public ResponseEntity<?> apagarId(@PathVariable Long id) {
        return ResponseEntity.ok(pratoService.deletar(id));
    }

    //Para alterar as informações no id especifico
    @PutMapping("/{id}")
    public ResponseEntity<?> alterar(@PathVariable Long id, @RequestBody PratoRequest request) {

        return ResponseEntity.ok(pratoService.alterar(id, request));
    }
}
