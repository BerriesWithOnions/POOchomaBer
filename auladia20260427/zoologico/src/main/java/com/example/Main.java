package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zoológico");

        Cachorro rex = new Cachorro("Rex");
        Canarinho godofredo = new Canarinho("godofredo");
        Pato duck = new Pato("duck");

        rex.emitirSom();
        rex.andar();

        godofredo.emitirSom();
        godofredo.voar();

        duck.emitirSom();
        duck.andar();
        duck.voar();
        duck.nadar();

    }
}