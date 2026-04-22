package com.bernas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Quadrado qd = new Quadrado(4);
        // System.out.println("Área do quadrado: " + qd.calcularArea() + " um.");
        
        Triangulo tr = new Triangulo(2, 2);
        // System.out.println("Área do triângulo: " + tr.calcularArea() + " um.");    
        
        // A seguir criamos um objeto ArrayList e guardamos ele como um objeto que é um array de figuras geométricas
        ArrayList<FiguraGeometrica> estrFiguras = new ArrayList<>();

        // Todas as figuras geométricas possuem características em comum, mas comportamentos específicos
        // Posso criar figuras como figuras ou como elas mesmas (quadrado, triângulo, etc.)
        // Não posso instanciar uma pessoa como uma figura geométrica
        FiguraGeometrica qdo = new Quadrado(3);
        // System.out.println("Área do quadrado: " + qdo.calcularArea() + " um.");
        
        FiguraGeometrica tri = new Triangulo(5, 8);
        // System.out.println("Área do triângulo: " + tri.calcularArea() + " um.");
        
        // o vetor é a estrutura básica para criar qualquer operação dentro do computador
        estrFiguras.add(qd);
        estrFiguras.add(tr);
        estrFiguras.add(qdo);
        estrFiguras.add(tri);
        estrFiguras.add(new Quadrado(2.5));        

        estrFiguras.size();
        for(FiguraGeometrica fg : estrFiguras){
            System.out.println("Figura " + fg.getNome());
            System.out.println("Lados " + fg.getQuantidadeLados());
            System.out.println("Área " + fg.calcularArea());
            System.out.println("---------------------------------");


        }
    }
}