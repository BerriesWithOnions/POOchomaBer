package listas.lista1;

public class Paciente {

    private String nome;
    private double peso;
    private double altura;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularIMC() {
        // Fórmula do cálculo do IMC: [IMC = peso / (altura ^ 2)]
        return peso / (altura * altura);
    }

    public String classificarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else {
            return "Sobrepeso/Obesidade";
        }
    }
}
