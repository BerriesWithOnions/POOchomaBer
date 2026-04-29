package com.calendario;

public class Main {
    public static void main(String[] args) {
        
        DiaSemana dia = DiaSemana.SEXTA;
        // Atividade atv1 = new Atividade("Estudar prova POO", "10:00", dia);
        
        System.out.println(DiaSemana.values()[0]);
        System.out.println(DiaSemana.QUARTA.ordinal());

        NivelAcesso admin = NivelAcesso.ADMIN;

        System.out.println(admin);
        System.out.println(admin.getDescricao());
        
        NivelAcesso usuario = NivelAcesso.ADMIN;
        /* O sistema deve permitir a criação de atividades apenas por um usuário */
        if(usuario.getDescricao() == NivelAcesso.ADMIN.getDescricao() || usuario.getDescricao() == NivelAcesso.USUARIO.getDescricao()){
            Atividade atvx = new Atividade("lalala", "12:00", dia);
            System.out.println("Nova atividade criada com sucesso: "+atvx);
        }else if(usuario.getDescricao() == NivelAcesso.LEITOR.getDescricao()){
            System.err.println("Nivel de acesso abaixo do exigido");
        }
    }
}