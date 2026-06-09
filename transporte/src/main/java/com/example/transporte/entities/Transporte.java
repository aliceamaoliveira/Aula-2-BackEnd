package com.example.transporte.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Transporte {

    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String tipo;
    private Double capacidade;
    private int valor;

    public Transporte(){}

    public Transporte(String nome, String tipo, Double capacidade, int valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.valor = valor;
    }

    public Transporte(long id, String nome, String tipo, Double capacidade, int valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Double capacidade) {
        this.capacidade = capacidade;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
