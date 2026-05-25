package listas.lista2;

class Carro {
    private String marca;

    private String modelo;
    private Motor motor;

    public Carro(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void ligarCarro() {
        System.out.println("Rommmmmbombombombom! O seu " + this.modelo + " está ligado.");
    }

    public void exibirFichaTecnica() {
        System.out.println("Carro: " + this.marca + " " + this.modelo);
        System.out.println("Motor: " + motor.getTipo() + " | Potência: " + motor.getPotencia() + "cv | Série: " + motor.getNumeroSerie());
    }
}