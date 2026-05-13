package listas.lista1;

public class Main {
    public static void main(String[] args) {
    
        Pessoa juliano = new Pessoa();

        Produto abobrinha = new Produto();
        Produto sabonete = new Produto();

        juliano.setNome("Juliano");
        juliano.setIdade(27);
    
        juliano.exibirDados();

        abobrinha.setNome("Abobrinha");
        abobrinha.setPreco(5.13);
        sabonete.setNome("Sabonete");
        sabonete.setPreco(2.13);
    }
}