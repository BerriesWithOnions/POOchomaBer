package com.example;

public class Canarinho extends Animal implements Voador{

    public Canarinho(String nome) {
        super(nome);
    }
    
    public void voar(){
        System.out.println("Está VOANDO!!!");
    }

    @Override
    public void emitirSom(){
        System.out.println(getNome() + "[Canta] fififi");
    }
}
