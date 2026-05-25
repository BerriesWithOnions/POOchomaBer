package listas.lista2;

public class Livro {
    private String titulo;
    private String autor;
    private ISBN isbn;

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public ISBN getIsbn() {
        return isbn;
    }
    
    public Livro(String titulo, String autor, ISBN isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public void exibirLivro() {
        System.out.println("Livro: " + titulo + " | Autor: " + autor);
        System.out.println("ISBN: " + isbn.getCodigo() + " | Editora: " + isbn.getEditora());
    }

}
