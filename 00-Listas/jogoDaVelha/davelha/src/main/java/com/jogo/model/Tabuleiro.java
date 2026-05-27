package com.jogo.model;

public class Tabuleiro {

    private Simbolo[][] casas;

    public Tabuleiro() {
        casas = new Simbolo[3][3]; 
    }

    public boolean posicaoLivre(int linha, int coluna) {
        return casas[linha][coluna] == null;
    }

    public void registrarJogada(int linha, int coluna, Simbolo simbolo) {
        casas[linha][coluna] = simbolo;
    }

    public boolean verificarVitoria(Simbolo simbolo) {
        for (int i = 0; i < 3; i++) {
            if (casas[i][0] == simbolo && casas[i][1] == simbolo && casas[i][2] == simbolo)
                return true;
        }
        for (int j = 0; j < 3; j++) {
            if (casas[0][j] == simbolo && casas[1][j] == simbolo && casas[2][j] == simbolo)
                return true;
        }
        if (casas[0][0] == simbolo && casas[1][1] == simbolo && casas[2][2] == simbolo)
            return true;
        if (casas[0][2] == simbolo && casas[1][1] == simbolo && casas[2][0] == simbolo)
            return true;

        return false;
    }

    public boolean verificarEmpate() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (casas[i][j] == null)
                    return false;
        return true;
    }

    public Simbolo[][] getCasas() {
        return casas;
    }
}
