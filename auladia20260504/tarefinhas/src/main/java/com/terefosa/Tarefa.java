package com.terefosa;

public class Tarefa {
    
    private String descricao;
    private Usuario usuarioResponsavel;
    
    public Tarefa(String descricao, Usuario usuarioResponsavel) {
        this.descricao = descricao;
        this.usuarioResponsavel = usuarioResponsavel;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Usuario getUsuarioResponsavel() {
        return usuarioResponsavel;
    }
    
    public void setUsuarioResponsavel(Usuario usuarioResponsavel) {
        this.usuarioResponsavel = usuarioResponsavel;
    }
    
    @Override
    // método para gerar uma string com o que é a tarefa dada pelo objeto tarefa
    public String toString(){
        return "Tarefa " + descricao + " do Usuario " + usuarioResponsavel;
    }
}
