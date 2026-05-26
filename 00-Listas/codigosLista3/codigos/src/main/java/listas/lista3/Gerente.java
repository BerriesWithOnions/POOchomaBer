package listas.lista3;

public class Gerente extends Funcionario {
    String setor;

    public String getSetor() {
        return setor;
    }

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public void exibirGerente() {
        exibir();
        System.out.println("Setor: " + setor);
    }
}
