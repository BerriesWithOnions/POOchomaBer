package com.bernas;


import com.bernas.controller.AlunoController;
import com.bernas.excecao.Validacao;

public class Main {
    public static void main(String[] args) {

        AlunoController aluno1 = new AlunoController();
        AlunoController aluno2 = new AlunoController();

    try{
        aluno2.cadastrar("",9);
        System.out.println("Aluno cadastrado");
    }catch(Validacao e){
        System.out.println(e.getMessage());
    }
        
    try{
        aluno1.cadastrar("João",5);
        System.out.println("Aluno cadastrado");
    }catch(Validacao e){
        System.out.println(e.getMessage());
    }

}
}