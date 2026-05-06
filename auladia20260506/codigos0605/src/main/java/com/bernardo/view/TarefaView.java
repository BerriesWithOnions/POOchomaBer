package com.bernardo.view;

import java.util.List;
import java.util.Scanner;
import com.bernardo.controller.TarefaControle;
public class TarefaView {
    // Não posso importar Tarefa diretamente. Nem mesmo usando import da outra pasta.

    // Quando instancio o objeto tenho que fazer junto o scanner e o controle
    private Scanner scan;
    private TarefaControle controle;

    public TarefaView(){
        this.scan = new Scanner(System.in); // coisa do Java
        this.controle = new TarefaControle();
    }

    public void exibirMenu(){
        int opcao;
        
        do {

            System.out.println("System Tarefas :)");
            System.out.println("Digite 0, 1 ou 2: ");

            opcao = Integer.parseInt(scan.nextLine());

            switch (opcao) {
                case 1:
                    cadastrarTarefa();
                    break;

                case 2:
                    listaTarefas();
                    break;

                case 0:
                    System.out.println("Encerrando ...");
                    break;

                default:
                    System.out.println("Opção incorreta! :(");
                    break;
            }

        } while (opcao != 0);
    }

    // cadastrar e listar é exclusivo dessa classe. Não deve ser acessado na main().
    private void cadastrarTarefa(){
        System.out.println("Digite o titulo: ");
        String titulo = scan.nextLine();
        
        System.out.println("Digite a descrição: ");
        String descricao = scan.nextLine();

        controle.cadastrarTarefa(titulo, descricao);
    }

    /* private void listaTarefas(){
        List<Tarefa> lista = controle.listaTarefas();
        for (Tarefa t : lista){
            System.out.println(t.toString());
        }
    } */

    private void listaTarefas(){
        List<String> lista = controle.listaTarefasFormatadas();
        for (String s : lista){
            System.out.println(s);
        }
    }
}
