package com.example;

public class Cachorro extends Animal implements Terrestre {
    
    public Cachorro(String nome) {
        super(nome);
    }

    public void andar(){
        System.out.println("Está ANDANDO!!!");
    }

    @Override
    public void emitirSom(){
        System.out.println(getNome() + "[Late] auau");
    }
}
