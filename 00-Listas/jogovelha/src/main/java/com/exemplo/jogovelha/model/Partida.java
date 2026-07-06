package com.exemplo.jogovelha.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.CascadeType;

@Entity
public class Partida {

    private static final int TAMANHO = 3;
    private static final char VAZIO = '-';

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // cascade ALL: quando a Partida é salva, os Jogadores são salvos junto.
    // Eles não existem fora do contexto de uma partida (não há tela de
    // "cadastro de jogador" isolada), então fazem parte do mesmo agregado.
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "jogador_x_id")
    private Jogador jogadorX;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "jogador_o_id")
    private Jogador jogadorO;

    // Persistimos como String de 9 caracteres (RN do enunciado, item 6.4).
    // '-' representa posição vazia. Índice = linha * 3 + coluna.
    private String tabuleiro = "---------";

    @Enumerated(EnumType.STRING)
    private Simbolo turnoAtual = Simbolo.X;

    @Enumerated(EnumType.STRING)
    private StatusPartida status = StatusPartida.EM_ANDAMENTO;

    // Sem cascade: o vencedor é sempre um dos jogadores que JÁ existem
    // (jogadorX ou jogadorO), nunca um jogador novo.
    @OneToOne
    @JoinColumn(name = "vencedor_id")
    private Jogador vencedor;

    public Partida() {
        // construtor vazio exigido pelo JPA
    }

    public Partida(Jogador jogadorX, Jogador jogadorO) {
        this.jogadorX = jogadorX;
        this.jogadorO = jogadorO;
        // tabuleiro, turnoAtual e status já vêm com os valores padrão acima
    }

    // ======================================================
    // Comportamentos do domínio (item 6.5 da especificação)
    // ======================================================

    private int indice(int linha, int coluna) {
        return linha * TAMANHO + coluna;
    }

    public boolean posicaoValida(int linha, int coluna) {
        return linha >= 0 && linha < TAMANHO && coluna >= 0 && coluna < TAMANHO;
    }

    public char consultarPosicao(int linha, int coluna) {
        return tabuleiro.charAt(indice(linha, coluna));
    }

    public boolean posicaoLivre(int linha, int coluna) {
        return consultarPosicao(linha, coluna) == VAZIO;
    }

    public void marcarPosicao(int linha, int coluna, Simbolo simbolo) {
        StringBuilder sb = new StringBuilder(tabuleiro);
        sb.setCharAt(indice(linha, coluna), simbolo.name().charAt(0));
        this.tabuleiro = sb.toString();
    }

    // Verifica as 3 linhas, 3 colunas e as 2 diagonais para o símbolo informado
    public boolean verificarVitoria(Simbolo simbolo) {
        char s = simbolo.name().charAt(0);

        for (int i = 0; i < TAMANHO; i++) {
            // linha i
            if (tabuleiro.charAt(indice(i, 0)) == s
                    && tabuleiro.charAt(indice(i, 1)) == s
                    && tabuleiro.charAt(indice(i, 2)) == s) {
                return true;
            }
            // coluna i
            if (tabuleiro.charAt(indice(0, i)) == s
                    && tabuleiro.charAt(indice(1, i)) == s
                    && tabuleiro.charAt(indice(2, i)) == s) {
                return true;
            }
        }

        // diagonal principal (↘)
        if (tabuleiro.charAt(indice(0, 0)) == s
                && tabuleiro.charAt(indice(1, 1)) == s
                && tabuleiro.charAt(indice(2, 2)) == s) {
            return true;
        }

        // diagonal secundária (↙)
        if (tabuleiro.charAt(indice(0, 2)) == s
                && tabuleiro.charAt(indice(1, 1)) == s
                && tabuleiro.charAt(indice(2, 0)) == s) {
            return true;
        }

        return false;
    }

    public boolean tabuleiroCompleto() {
        return tabuleiro.indexOf(VAZIO) == -1;
    }

    public void alternarTurno() {
        this.turnoAtual = (turnoAtual == Simbolo.X) ? Simbolo.O : Simbolo.X;
    }

    // ======================================================
    // Serialização para JSON (item 10 da especificação)
    // ======================================================
    // A entidade guarda o tabuleiro como String internamente (fácil de persistir),
    // mas o contrato da API pede uma matriz 3x3. Como o @Id está no campo (não no
    // getter), o Hibernate acessa os atributos diretamente e ignora essas anotações
    // do Jackson — então podemos moldar a serialização JSON livremente, sem
    // interferir na persistência.

    @JsonIgnore
    public String getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(String tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    @JsonProperty("tabuleiro")
    public String[][] getTabuleiroComoMatriz() {
        String[][] matriz = new String[TAMANHO][TAMANHO];
        for (int l = 0; l < TAMANHO; l++) {
            for (int c = 0; c < TAMANHO; c++) {
                char ch = tabuleiro.charAt(indice(l, c));
                matriz[l][c] = (ch == VAZIO) ? null : String.valueOf(ch);
            }
        }
        return matriz;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Jogador getJogadorX() {
        return jogadorX;
    }

    public void setJogadorX(Jogador jogadorX) {
        this.jogadorX = jogadorX;
    }

    public Jogador getJogadorO() {
        return jogadorO;
    }

    public void setJogadorO(Jogador jogadorO) {
        this.jogadorO = jogadorO;
    }

    public Simbolo getTurnoAtual() {
        return turnoAtual;
    }

    public void setTurnoAtual(Simbolo turnoAtual) {
        this.turnoAtual = turnoAtual;
    }

    public StatusPartida getStatus() {
        return status;
    }

    public void setStatus(StatusPartida status) {
        this.status = status;
    }

    public Jogador getVencedor() {
        return vencedor;
    }

    public void setVencedor(Jogador vencedor) {
        this.vencedor = vencedor;
    }
}
