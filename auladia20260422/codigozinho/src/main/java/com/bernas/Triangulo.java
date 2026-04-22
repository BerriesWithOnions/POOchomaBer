package com.bernas;

public class Triangulo extends FiguraGeometrica {
    
    private double base;
    private double altura;

    public Triangulo(double altura, double base){
        super("Triângulo", 3);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea(){
        return base * altura / 2;
}
}