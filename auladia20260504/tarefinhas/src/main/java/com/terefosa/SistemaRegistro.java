package com.terefosa;

import java.util.ArrayList;
import java.util.List;

public class SistemaRegistro {
    
    // a tarefa é registrada, e o usuário só dá o comando para registrar. Por isso eu preciso
    // de uma classe Sistema, porque é o objeto dessa classequem vai registrar a tarefa no sistema

    private List<Tarefa> tarefas;

    public SistemaRegistro(){
        // precisa criar o atributo da lista de tarefas no construtor pra essa lista ficar "viva"

        this.tarefas = new ArrayList<Tarefa>();
    }

    // mudamos o registro de void para boolean para validar de forma mais direta
    public boolean registrarTarefa(String descricao, Usuario usuario){
        if(usuario.getTipoUsuario() == TipoUsuario.PADRAO){
            // registrar
            Tarefa tarefa = new Tarefa(descricao, usuario);
            tarefas.add(tarefa);
            return true;
        }
        // não registro
        return false;
    }

    public boolean removerTarefa(Tarefa tarefa, Usuario usuario){
        if (usuario.getTipoUsuario() == TipoUsuario.ADMIN){
            tarefas.remove(tarefa);
            return true;
        }
        return false;
    }
}
