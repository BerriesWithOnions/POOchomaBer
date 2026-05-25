package listas.lista2;

class Pessoa {
    private String nome;
    private int idade;
    private CPF cpf;

    public Pessoa(String nome, int idade, CPF cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | CPF: " + cpf + " | Idade: " + idade);
    }
}