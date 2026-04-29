package com.calendario;

public class Atividade {
    private String descricao;
    private String hora; 
    private DiaSemana diaSemana;

    public Atividade(String descricao, String hora, DiaSemana diaSemana) {
        this.descricao = descricao;
        this.hora = hora;
        this.diaSemana = diaSemana;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public DiaSemana getdiaSemana() {
        return diaSemana;
    }

    public void setdiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }
    
}
