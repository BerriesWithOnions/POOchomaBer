package com.example;

public class Pato extends Animal implements Terrestre, Voador, Aquatico {

    public Pato(String nome) {
        super(nome);
    }

    @Override
    public void andar() {
        System.out.println("Está ANDANDO!!! XD");
    }
    
    @Override
    public void voar(){
        System.out.println("Está VOANDO!!!");
    }

    @Override
    public void nadar(){
        System.out.println("Está NADANDO DX");
    }
}
