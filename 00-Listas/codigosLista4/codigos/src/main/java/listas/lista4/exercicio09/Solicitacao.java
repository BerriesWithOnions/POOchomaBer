package listas.lista4.exercicio09;

public class Solicitacao {
    private String descricao;
    private Usuario criador;

    public Solicitacao(String descricao, Usuario criador) {
        this.descricao = descricao;
        this.criador = criador;
    }

    public String getDescricao() { return descricao; }
    public Usuario getCriador() { return criador; }
}
