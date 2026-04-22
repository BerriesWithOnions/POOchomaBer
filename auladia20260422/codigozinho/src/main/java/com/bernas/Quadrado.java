package com.bernas;

public class Quadrado extends FiguraGeometrica{

    private double lado;
    
    public Quadrado(double lado){
        super("Quadrado", 4);
        this.lado = lado;
        /* nesse caso, como o nome do quadrado não muda, e ele tem sempre 4 lados, a única coisa
        que eu preciso insatnciar no objeto é o tamanho do lado, que pode variar */
    }
    
    @Override
    public double calcularArea(){
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
