package com.jogo.controller;

import com.jogo.model.JogadaInvalidaException;
import com.jogo.model.Jogador;
import com.jogo.model.Simbolo;
import com.jogo.model.StatusPartida;
import com.jogo.model.Tabuleiro;

public class JogoDaVelhaController {

    private Tabuleiro tabuleiro;
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador jogadorAtual;
    private StatusPartida status;

    public JogoDaVelhaController(String nomeJogador1, String nomeJogador2) {
        this.jogador1 = new Jogador(nomeJogador1, Simbolo.X);
        this.jogador2 = new Jogador(nomeJogador2, Simbolo.O);
        this.tabuleiro = new Tabuleiro();
        this.jogadorAtual = jogador1; 
        this.status = StatusPartida.EM_ANDAMENTO;
    }

    public void processarJogada(int linha, int coluna) throws JogadaInvalidaException {
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
            throw new JogadaInvalidaException("Posição inválida. Linha e coluna devem estar entre 0 e 2.");
        }

        if (!tabuleiro.posicaoLivre(linha, coluna)) {
            throw new JogadaInvalidaException("Posição já ocupada. Escolha outra.");
        }

        tabuleiro.registrarJogada(linha, coluna, jogadorAtual.getSimbolo());

        if (tabuleiro.verificarVitoria(jogadorAtual.getSimbolo())) {
            status = StatusPartida.VITORIA;
            return;
        }

        if (tabuleiro.verificarEmpate()) {
            status = StatusPartida.EMPATE;
            return;
        }

        alternarJogador();
    }

    private void alternarJogador() {
        jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;
    }

    public Jogador getJogadorAtual() {
        return jogadorAtual;
    }

    public StatusPartida getStatus() {
        return status;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public boolean partidaEncerrada() {
        return status != StatusPartida.EM_ANDAMENTO;
    }
}
