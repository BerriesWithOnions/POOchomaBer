package listas.lista4.exercicio03;

public class Usuario {
    private String nome;
    private TipoUsuario tipo;

    public Usuario(String nome, TipoUsuario tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() { return nome; }
    public TipoUsuario getTipo() { return tipo; }
}
