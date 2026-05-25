package listas.lista2;

public class Funcionario {
    private String nome;
    private String cargo;
    private Cracha cracha;

    public Funcionario(String nome, String cargo, Cracha cracha) {
        this.nome = nome;
        this.cargo = cargo;
        this.cracha = cracha;
    }

    public void exibirFuncionario() {
        System.out.println("Funcionário: " + nome + " | Cargo: " + cargo);
        System.out.println("Crachá: " + cracha.getCodigo() + " | Validade: " + cracha.getDataValidade() + "\n");
    }
}
