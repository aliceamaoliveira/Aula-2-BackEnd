package com.biolab.restaurante.Services;

import com.biolab.restaurante.DTOs.PratoRequest;
import com.biolab.restaurante.DTOs.PratoResponse;
import com.biolab.restaurante.entities.Prato;
import com.biolab.restaurante.repositories.PratoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PratoServices {

    private final PratoRepository pratoRepository;

    //Receber o repositório dos pratos;
    public PratoServices(PratoRepository pratoRepository) {
        this.pratoRepository = pratoRepository;
    }

    //Para criar um novo prato e salvar os dados no banco;
    public PratoRequest criarPrato(PratoRequest request) {

        Prato prato = new Prato();

        prato.setNome(request.getNome());
        prato.setCategoria(request.getCategoria());
        prato.setPreco(request.getPreco());

        pratoRepository.save(prato);

        return request;
    }
    //Aqui ele vai buscar os pratos cadastrados no banco de dados.
    public List<PratoResponse> mostrarPratos() {

        List<Prato> pratos = pratoRepository.findAll();

        List<PratoResponse> listaResponse = new ArrayList<>();

        for (Prato prato : pratos) {

            PratoResponse pratoResponse = new PratoResponse();

            pratoResponse.setId(prato.getId());
            pratoResponse.setNome(prato.getNome());
            pratoResponse.setCategoria(prato.getCategoria());
            pratoResponse.setPreco(prato.getPreco());

            listaResponse.add(pratoResponse);
        }

        return listaResponse;
    }

    //Buscar um prato especifico no banco
    public PratoResponse buscarID(long id) {

        Optional<Prato> prato = pratoRepository.findById(id);

        PratoResponse pratoResponse = new PratoResponse();

        pratoResponse.setId(prato.get().getId());
        pratoResponse.setNome(prato.get().getNome());
        pratoResponse.setCategoria(prato.get().getCategoria());
        pratoResponse.setPreco(prato.get().getPreco());

        return pratoResponse;
    }

    //Para excluir um prato especifico no banco, usando o id;
    public String deletar(long id) {

        Optional<Prato> prato = pratoRepository.findById(id);

        if (prato == null) {
            return "Prato não existe";
        } else {
            pratoRepository.deleteById(id);
            return "Prato deletado";
        }
    }
   //Para alterar a informações de um prato especifico, usndo o id;
    public String alterar(long id, PratoRequest request) {

        Prato prato = pratoRepository.findById(id).orElseThrow();

        prato.setNome(request.getNome());
        prato.setCategoria(request.getCategoria());
        prato.setPreco(request.getPreco());

        pratoRepository.save(prato);

        return "ok";
    }
}