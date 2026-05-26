package listas.lista3;

public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibir() {
        System.out.println("Nome: " + nome + " | Salário: R$" + salario);
    }
}
