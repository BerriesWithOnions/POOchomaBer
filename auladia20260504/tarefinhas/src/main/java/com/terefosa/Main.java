package com.terefosa;

public class Main {
    public static void main(String[] args) {
    
        // tarefa, tipo de usuario e usuario estão todos sendo usados no sistema de registro

        Usuario user1 = new Usuario("Joao", TipoUsuario.PADRAO);
        Usuario user2 = new Usuario("Carlos", TipoUsuario.VISITANTE);
        

        SistemaRegistro sr = new SistemaRegistro();

        boolean tarefa1 = sr.registrarTarefa( "Almoço", user1);
        boolean tarefa2 = sr.registrarTarefa( "Estudos", user2);

        System.out.println("user1 registrou? " + tarefa1);
        System.out.println("user2 registrou? " + tarefa2);

    }
}