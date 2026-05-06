package com.bernardo.model;

public class Tarefa {
    
    private String titulo;
    private String descricao;

    public Tarefa(String titulo, String descricao){
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    // Não precisa ter operações. A tarefa da tarefa é ser uma tarefa.
}
