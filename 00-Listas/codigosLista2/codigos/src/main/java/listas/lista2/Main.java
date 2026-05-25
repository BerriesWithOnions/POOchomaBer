package listas.lista2;

public class Main {
    public static void main(String[] args) {
        CPF meuCpf = new CPF("123.456.789-00", "Regular");
        Pessoa joao = new Pessoa("João", 25, meuCpf);
        
        joao.exibirDados();
    }
}