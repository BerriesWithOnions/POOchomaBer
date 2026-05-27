package com.jogo.view;

import com.jogo.controller.JogoDaVelhaController;
import com.jogo.model.JogadaInvalidaException;
import com.jogo.model.Simbolo;
import com.jogo.model.StatusPartida;

import java.util.Scanner;

public class JogoDaVelhaView {

    private Scanner sc;
    private JogoDaVelhaController controller;

    public JogoDaVelhaView() {
        sc = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("  -------------------------------  ");
        System.out.println("        JOGO DA VELHA - Java    ");
        System.out.println("     Professor Choma eu te amo    ");
        System.out.println("  -------------------------------  ");

        System.out.print("Nome do Jogador 1 (X): ");
        String nome1 = sc.nextLine().trim();

        System.out.print("Nome do Jogador 2 (O): ");
        String nome2 = sc.nextLine().trim();

        controller = new JogoDaVelhaController(nome1, nome2);

        System.out.println("\nPartida iniciada! Boa sorte, " + nome1 + " e " + nome2 + "!\n");

        while (!controller.partidaEncerrada()) {
            exibirTabuleiro();
            solicitarJogada();
        }

        exibirTabuleiro();
        exibirResultado();

        sc.close();
    }

    private void exibirTabuleiro() {
        Simbolo[][] casas = controller.getTabuleiro().getCasas();

        System.out.println("\n  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                String celula = (casas[i][j] == null) ? " " : casas[i][j].toString();
                System.out.print(" " + celula + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  ---|---|---");
        }
        System.out.println();
    }

    private void solicitarJogada() {
        String nomeAtual = controller.getJogadorAtual().getNome();
        String simboloAtual = controller.getJogadorAtual().getSimbolo().toString();

        System.out.println("Vez de " + nomeAtual + " [" + simboloAtual + "]");

        try {
            System.out.print("  Linha (0-2): ");
            int linha = Integer.parseInt(sc.nextLine().trim());

            System.out.print("  Coluna (0-2): ");
            int coluna = Integer.parseInt(sc.nextLine().trim());

            controller.processarJogada(linha, coluna);

        } catch (NumberFormatException e) {
            System.out.println("  [ERRO] Digite apenas números inteiros.\n");

        } catch (JogadaInvalidaException e) {
            System.out.println("  [ERRO] " + e.getMessage() + "\n");
        }
    }

    private void exibirResultado() {
        StatusPartida status = controller.getStatus();

        System.out.println("-------------------------------");
        if (status == StatusPartida.VITORIA) {
            String vencedor = controller.getJogadorAtual().getNome();
            String simbolo = controller.getJogadorAtual().getSimbolo().toString();
            System.out.println("  " + vencedor + " [" + simbolo + "] venceu! Abrace o coleguinha!");
        } else if (status == StatusPartida.EMPATE) {
            System.out.println("  Empate! Niguém vai ganhar nem perder.");
        }
        System.out.println("-------------------------------\n");
    }
}
