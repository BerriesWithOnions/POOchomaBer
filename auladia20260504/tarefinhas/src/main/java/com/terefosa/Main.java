package com.terefosa;

public class Main {
    public static void main(String[] args) {
    
        // tarefa, tipo de usuario e usuario estão todos sendo usados no sistema de registro

        Usuario user1 = new Usuario("Joao", TipoUsuario.PADRAO);
        Usuario user2 = new Usuario("Carlos", TipoUsuario.VISITANTE);
        Usuario root = new Usuario("Bernardo", TipoUsuario.ADMIN);

        SistemaRegistro sr = new SistemaRegistro();

        boolean almoco = sr.registrarTarefa( "Almoço", user1);
        boolean estudos = sr.registrarTarefa( "Estudos", user2);

        System.out.println("user1 registrou? " + almoco);
        System.out.println("user2 registrou? " + estudos);

        sr.removeTarefa(root, "Almoço");

    }
}