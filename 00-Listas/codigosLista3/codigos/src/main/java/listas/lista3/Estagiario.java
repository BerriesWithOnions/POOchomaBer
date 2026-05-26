package listas.lista3;

public class Estagiario extends Funcionario {
    String universidade;

    public String getUniversidade() {
        return universidade;
    }

    public Estagiario(String nome, double salario, String universidade) {
        super(nome, salario);
        this.universidade = universidade;
    }

    public void exibirEstagiario() {
        exibir();
        System.out.println("[Estagiário] da universidade "  + universidade);
    }
}
