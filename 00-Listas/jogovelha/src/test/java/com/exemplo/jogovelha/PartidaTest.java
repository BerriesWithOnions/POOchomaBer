package com.exemplo.jogovelha;

import com.exemplo.jogovelha.model.Jogador;
import com.exemplo.jogovelha.model.Partida;
import com.exemplo.jogovelha.model.Simbolo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PartidaTest {

    private Partida partida;

    @BeforeEach
    void montarPartida() {
        Jogador jogadorX = new Jogador("Ana", Simbolo.X);
        Jogador jogadorO = new Jogador("Bruno", Simbolo.O);
        partida = new Partida(jogadorX, jogadorO);
    }

    @Test
    void deveComecarComTabuleiroVazioETurnoDoX() {
        assertEquals(Simbolo.X, partida.getTurnoAtual());
        assertTrue(partida.posicaoLivre(0, 0));
    }

    @Test
    void deveMarcarPosicaoCorretamente() {
        partida.marcarPosicao(1, 1, Simbolo.X);
        assertEquals('X', partida.consultarPosicao(1, 1));
        assertFalse(partida.posicaoLivre(1, 1));
    }

    @Test
    void deveAlternarTurnoCorretamente() {
        partida.alternarTurno();
        assertEquals(Simbolo.O, partida.getTurnoAtual());
        partida.alternarTurno();
        assertEquals(Simbolo.X, partida.getTurnoAtual());
    }

    @Test
    void deveDetectarVitoriaNaLinha() {
        partida.marcarPosicao(0, 0, Simbolo.X);
        partida.marcarPosicao(0, 1, Simbolo.X);
        partida.marcarPosicao(0, 2, Simbolo.X);
        assertTrue(partida.verificarVitoria(Simbolo.X));
    }

    @Test
    void deveDetectarVitoriaNaColuna() {
        partida.marcarPosicao(0, 2, Simbolo.O);
        partida.marcarPosicao(1, 2, Simbolo.O);
        partida.marcarPosicao(2, 2, Simbolo.O);
        assertTrue(partida.verificarVitoria(Simbolo.O));
    }

    @Test
    void deveDetectarVitoriaNaDiagonalPrincipal() {
        partida.marcarPosicao(0, 0, Simbolo.X);
        partida.marcarPosicao(1, 1, Simbolo.X);
        partida.marcarPosicao(2, 2, Simbolo.X);
        assertTrue(partida.verificarVitoria(Simbolo.X));
    }

    @Test
    void deveDetectarVitoriaNaDiagonalSecundaria() {
        partida.marcarPosicao(0, 2, Simbolo.O);
        partida.marcarPosicao(1, 1, Simbolo.O);
        partida.marcarPosicao(2, 0, Simbolo.O);
        assertTrue(partida.verificarVitoria(Simbolo.O));
    }

    @Test
    void naoDeveAcusarVitoriaSemLinhaColunaOuDiagonalCompleta() {
        partida.marcarPosicao(0, 0, Simbolo.X);
        partida.marcarPosicao(0, 1, Simbolo.X);
        assertFalse(partida.verificarVitoria(Simbolo.X));
    }

    @Test
    void deveDetectarTabuleiroCompleto() {
        Simbolo[] sequencia = { Simbolo.X, Simbolo.O, Simbolo.X,
                                 Simbolo.X, Simbolo.O, Simbolo.O,
                                 Simbolo.O, Simbolo.X, Simbolo.X };
        int i = 0;
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                partida.marcarPosicao(linha, coluna, sequencia[i++]);
            }
        }
        assertTrue(partida.tabuleiroCompleto());
        assertFalse(partida.verificarVitoria(Simbolo.X));
        assertFalse(partida.verificarVitoria(Simbolo.O));
    }

    @Test
    void deveRejeitarPosicaoForaDoIntervalo() {
        assertFalse(partida.posicaoValida(-1, 0));
        assertFalse(partida.posicaoValida(0, 3));
        assertTrue(partida.posicaoValida(2, 2));
    }
}
