package listas.lista3;

public class Livro {
    String titulo;
    String autor;

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibir() {
        System.out.println("Livro: \"" + titulo + "\" - " + autor);
    }
}
