package com.bernardo.controller;

import java.util.ArrayList;
import java.util.List;
import com.bernardo.model.Tarefa;

public class TarefaControle {
    // Posso acessar a tarefa, e deixo TarefaView me acessar

    private List<Tarefa> tarefas;

    public TarefaControle(){
        this.tarefas = new ArrayList<>();
    }

    public boolean cadastrarTarefa(String titulo, String descricao){
        if (titulo == null || titulo.isBlank() || titulo.isEmpty()){
            return false;
        }
        Tarefa tr = new Tarefa(titulo, descricao);
        tarefas.add(tr);
        return true;
    }

    public List<Tarefa> listaTarefas(){
        return tarefas;
        // Printar as tarefas é para o usuário, então vai ser função do view, não do controller.
    }

    public List<String> listaTarefasFormatadas() {
        List<String> listaFormatada = new ArrayList<>();
        for (Tarefa t : this.tarefas) {
            listaFormatada.add("Tarefa: " + t.getTitulo() + " - " + t.getDescricao());
        }
        return listaFormatada;
    }
}
