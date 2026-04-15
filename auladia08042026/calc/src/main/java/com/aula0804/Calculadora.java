package com.aula0804;

public class Calculadora {
    
    private double fator1;
    private double fator2;

    public double getFator1(){
        return fator1;
    }
    
    public double getFator2(){
        return fator2;
    }

    public void setFator1(double fator1){
        this.fator1 = fator1;
    }
    
    public void setFator2(double fator2){
        this.fator2 = fator2;
    }
    
    public double somar(){
        return fator1 + fator2;
    }

    public double subtrair(){
        return fator1 - fator2;
    }
    
    public double multiplicacao(){
        return fator1 * fator2;
    }
    
    public double divisao(){
        if(fator2 == 0){
            throw new ArithmeticException("Divisão por zero");
        }
        return fator1 / fator2;
    }

}
