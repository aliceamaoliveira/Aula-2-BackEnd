package com.biolab.todolist.DTOs;

import jakarta.validation.constraints.NotNull;

public class TarefaRequest {

    @NotNull
    private String nome;

    private String data;
    private String descricao;
    private long idUsuario;

    public TarefaRequest() {
    }

    public TarefaRequest(String nome, String data, String descricao, long idUsuario) {
        this.nome = nome;
        this.data = data;
        this.descricao = descricao;
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }
}