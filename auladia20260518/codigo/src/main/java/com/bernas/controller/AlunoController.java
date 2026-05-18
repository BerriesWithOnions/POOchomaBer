package com.bernas.controller;

import java.util.ArrayList;
import java.util.List;

import com.bernas.excecao.Validacao;
import com.bernas.model.Aluno;

public class AlunoController {
    
    // todo aluno tem que ter um nome não vazio
    // todo aluno tem que ter uma nota não vazia, nota >= 0 && nota <= 10

    private List<Aluno> listaAlunos;

    // posso fazer 
    // private Aluno alunos[]
    // mas daí eu teria que fazer um método de inserção. No arraylist eu já tenho tudo implementado, então para
    // inserir, por exemplo, se eu fizer arraylist eu posso simplesmente colocar alunos.add()

    public AlunoController(){
        this.listaAlunos = new ArrayList<>();
    }

    // Quando tem exceções com throws eu preciso indicar na função que esses throws existem e em qual classe eles vão "estourar"
    public void cadastrar(String nome, double nota) throws Validacao{
        validarNome(nome);
        Aluno aluno = new Aluno(nome, nota);
        listaAlunos.add(aluno);
    }

    // Quando tem exceções com throws eu preciso indicar na função que esses throws existem e em qual classe eles vão "estourar"
    private void validarNome(String nome) throws Validacao{
        if(nome == null || nome.isBlank()){
            throw new Validacao("O nome do aluno é obrigatório! D:<");
        }
    }
}
