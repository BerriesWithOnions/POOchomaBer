package listas.lista1;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarInformacoes(){
        System.out.println("Dados do produto:");
        System.out.println("Nome: "+getNome());
        System.out.println("Preço: "+getPreco());
    }

    
}
