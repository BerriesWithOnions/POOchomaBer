package listas.lista4.exercicio02;

public class Comentario {
    private String texto;
    private Usuario autor;

    public Comentario(String texto, Usuario autor) {
        this.texto = texto;
        this.autor = autor;
    }

    public String getTexto() { return texto; }
    public Usuario getAutor() { return autor; }
}
