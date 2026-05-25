package listas.lista2;

class Motor {
    private String tipo;
    private int potencia;
    private String numeroSerie;

    public Motor(String tipo, int potencia, String numeroSerie) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() { 
        return tipo; 
    }
    public int getPotencia() { 
        return potencia; 
    }
    public String getNumeroSerie() { 
        return numeroSerie; 
    }
}