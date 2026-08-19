package com.biolab.restaurante.DTOs;

//Para organizar os dados do prato
public class PratoResponse {

    private long id;
    private String nome;
    private String categoria;
    private Double preco;

//cONSTRUTOR VAZIO DA CLASSE
    public PratoResponse() {
    }
//Para receber os dados do prato.
    public PratoResponse(long id, String nome, String categoria, Double preco) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }
//para retornar o ID do prato
    public long getId() {
        return id;
    }
//para alterar o id do prato
    public void setId(long id) {
        this.id = id;
    }
//para retornar o nome do prato;
    public String getNome() {
        return nome;
    }
//para alterar o nome do prato
    public void setNome(String nome) {
        this.nome = nome;
    }
//para retonar categoria do prato
    public String getCategoria() {
        return categoria;
    }
//Para alterar a categoria do prato
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
//Para retornar o preço do prato
    public Double getPreco() {
        return preco;
    }
//para alterar o preço do prato
    public void setPreco(Double preco) {
        this.preco = preco;
    }
}