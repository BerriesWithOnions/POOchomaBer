package listas.lista4.exercicio06;

public class Nota {
    private String nomeAluno;
    private double valor;

    public Nota(String nomeAluno, double valor) {
        this.nomeAluno = nomeAluno;
        this.valor = valor;
    }

    public String getNomeAluno() { return nomeAluno; }
    public double getValor() { return valor; }
}
