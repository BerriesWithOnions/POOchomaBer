package listas.lista3;

public class Carro extends Veiculo {
    private int quantidadePortas;
    
    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    public void exibirCarro() {
        exibir();
        System.out.println("Portas: " + quantidadePortas);
    }
}
