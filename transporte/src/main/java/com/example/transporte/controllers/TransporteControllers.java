package com.example.transporte.controllers;

import com.example.transporte.entities.Transporte;
import com.example.transporte.repositories.TransporteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransporteControllers {

    private final TransporteRepository transporteRepository;

    public TransporteControllers(TransporteRepository transporteRepository) {this.transporteRepository = transporteRepository;}
@PostMapping
    public String criarTransporte(@RequestBody Transporte transporte){
        Transporte s = new Transporte(transporte.getNome(), transporte.getTipo(), transporte.getCapacidade(), transporte.getValor());
        transporteRepository.save(s);
        return "Salvo com sucesso!!";
    }
    @GetMapping
    public List<Transporte> mostrarUsuario(){
        List<Transporte> listarTransporte = transporteRepository.findAll();
        return listarTransporte;
    }
    @DeleteMapping(value = "/{id}")
    public String deletarTransporte(@PathVariable Long id){
        Transporte transporte = transporteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transporte não encontrado"));
        transporteRepository.deleteById(transporte.getId());
        return "Transporte excluído com sucesso!!";
    }
}


