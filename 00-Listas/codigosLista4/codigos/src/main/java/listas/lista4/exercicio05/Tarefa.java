package listas.lista4.exercicio05;

public class Tarefa {
    private String nome;
    private StatusTarefa status;

    public Tarefa(String nome, StatusTarefa status) {
        this.nome = nome;
        this.status = status;
    }

    public String getNome() { return nome; }
    public StatusTarefa getStatus() { return status; }
    public void setStatus(StatusTarefa status) { this.status = status; }
}
