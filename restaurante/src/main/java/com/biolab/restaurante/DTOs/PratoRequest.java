package com.biolab.restaurante.DTOs;


//Receber os dados do prato;
public class PratoRequest {

    private String nome;
    private String categoria;
    private Double preco;

    //Construtor vazio da classe.
    public PratoRequest() {
    }
//Construtor para receber os dados do prato.
    public PratoRequest(String nome, String categoria, Double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    //Para retornar o nome do prato.
    public String getNome() {
        return nome;
    }

//Para alterar o nome do prato.
    public void setNome(String nome) {
        this.nome = nome;
    }
//Para retornar a categoria do prato.
    public String getCategoria() {
        return categoria;
    }
//Para alterar a categoria do prato.
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
//Para retornar o preço do prat.
    public Double getPreco() {
        return preco;
    }
//para alterar o preço do prato
    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
