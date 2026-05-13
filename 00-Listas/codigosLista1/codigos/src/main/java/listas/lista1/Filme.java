package listas.lista1;

public class Filme {
    
    private String titulo;
    private String genero;
    private int duracao;
    private double avaliacao;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public double getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void alterarAvaliacao(double novaAvaliacao) {
        if (novaAvaliacao >= 0 && novaAvaliacao <= 10) {
            this.avaliacao = novaAvaliacao;
        }
    }

    public void exibirFichaTecnica() {
        System.out.println("Filme: " + titulo + " | Gênero: " + genero + " | Nota: " + avaliacao);
    }

}
