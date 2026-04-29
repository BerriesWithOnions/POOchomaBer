package com.calendario;

public enum NivelAcesso {
    ADMIN("Administrador"),
    USUARIO("Usuario"),
    LEITOR("Visitante");

    private String descricao;

    public String getDescricao(){
        return descricao;
    }

    NivelAcesso(String descricao){
        this.descricao = descricao;
    }
    
}
