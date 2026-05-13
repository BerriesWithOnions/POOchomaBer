package listas.lista1;

public class Jogador {

    // A pontuação de cada nível começa em zero e vai até 100.
    // Então um jogador no nível 3 com 10 pontos tem mais pontos do que um jogador nivel 1 com 98 pontos

    private String nome;
    private int pontuacao;
    private int nivel;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPontuacao() {
        return pontuacao;
    }
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void adicionarPontos(int valor) {
        this.pontuacao += valor;
        while (this.pontuacao >= 100) {
            subirNivel();
            this.pontuacao -= 100;
        }
    }

    private void subirNivel() {
        this.nivel++;
        System.out.println("O jogador " + nome + " subiu para o nível " + nivel + "!");
    }
}
