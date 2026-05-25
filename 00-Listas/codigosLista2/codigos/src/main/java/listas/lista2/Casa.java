package listas.lista2;

public class Casa {
    private String cor;
    private int quantidadeQuartos;
    private Endereco endereco;

    public Casa(String cor, int quantidadeQuartos, Endereco endereco) {
        this.cor = cor;
        this.quantidadeQuartos = quantidadeQuartos;
        this.endereco = endereco;
    }

    public void exibirCasa() {
        System.out.println("Casa " + cor + " com " + quantidadeQuartos + " quartos.");
        System.out.println("Localização: " + endereco.getEnderecoCompleto());
    }
}
