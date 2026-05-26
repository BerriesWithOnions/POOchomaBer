package listas.lista3;

public class Veiculo {
    private String marca;
    private String modelo;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibir() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo);
    }
}
