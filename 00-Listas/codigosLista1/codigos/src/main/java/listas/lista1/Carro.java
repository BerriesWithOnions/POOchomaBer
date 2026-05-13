package listas.lista1;

public class Carro {

    private String marca;
    private String modelo;
    private int velocidade;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar() {
        this.velocidade += 7;
    }

    public void frear() {
        this.velocidade -= 7;
        if (this.velocidade < 0) {
            this.velocidade = 0;
        }
    }

    public void mostrarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
}
