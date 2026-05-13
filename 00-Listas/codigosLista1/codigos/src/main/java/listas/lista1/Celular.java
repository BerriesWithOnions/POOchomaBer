package listas.lista1;

public class Celular {
    
    private String marca;
    private String modelo;
    private int nivelBateria;

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
    public int getNivelBateria() {
        return nivelBateria;
    }
    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public void carregar(int valor) {
        this.nivelBateria += valor;
        if (this.nivelBateria > 100) {
            this.nivelBateria = 100;
        }
    }

    public void usar(int valor) {
        this.nivelBateria -= valor;
        if (this.nivelBateria < 0) {
            this.nivelBateria = 0;
        }
    }
}