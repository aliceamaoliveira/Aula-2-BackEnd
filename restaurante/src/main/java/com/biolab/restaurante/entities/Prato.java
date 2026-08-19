package com.biolab.restaurante.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//para os dados do prato no banco
@Entity
public class Prato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String categoria;
    private Double preco;

    //Construtor vazio
    public Prato() {
    }

    //recebe todos os dados do prato.
    public Prato(long id, String nome, String categoria, Double preco) {
        id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }
    
//receber os dados do prato mas sem o id
    public Prato(String nome, String categoria, Double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

   //Para retornar o id do prato.
    public long getId() {
        return id;
    }

//Para alterar o id do prato
    public void setId(long id) {
        id = id;
    }

    //Para retornar o nome do prato.
    public String getNome() {
        return nome;
    }

    //Para alterar o nome do prato
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Para retornar a categoria do prato.
    public String getCategoria() {
        return categoria;
    }

    //Para alterar a cate4goria do prato
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //Para retornar o preco do prato.
    public Double getPreco() {
        return preco;
    }

    //Para alterar o preco do prato
    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
