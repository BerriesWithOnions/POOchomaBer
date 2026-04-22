package com.bernas;

public abstract class FiguraGeometrica {
    private String nome;
    private int quantidadeLados;

    public FiguraGeometrica(String nome, int quantidadeLados){
        this.nome = nome;
        this.quantidadeLados = quantidadeLados;
    }

    public int getQuantidadeLados() {
        return quantidadeLados;
    }

    public void setQuantidadeLados(int quantidadeLados) {
        this.quantidadeLados = quantidadeLados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea(); // Não consigo instanciar classe abstrata, então
    // obrigatoriamente preciso usar uma herança. Não tem outra forma de instanciar um objeto
    
}
