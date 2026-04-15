package com.aula0804;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("===============================");
        System.out.println("CALCULADORA DE DOIS FATORES");
        System.out.println("Digitar: 10 + 2 = 12");
        System.out.println("Digite sair para sair");
        System.out.println("===============================");

        // System.out.println("Digite algo: ");
        // String entrada = scan.nextLine();
        // System.out.println("Você digitou " + entrada);
        
        String entrada = "";
        while(entrada != "sair"){
            try {

                    System.out.println("Digite a expressão: ");
                    entrada = scan.nextLine();
                    
                    String[] partes = entrada.split(" ");
                    
                    if(partes.length != 3){
                        System.out.println("Digitou errado. Digite: ");
                        continue;
                    }
                    double fator1 = Double.parseDouble(partes[0]);
                    String operador = partes[1];
                    double fator2 = Double.parseDouble(partes[2]);

                    calculadora.setFator1((fator1));
                    calculadora.setFator2((fator2));

                    double resultado = 0.0;
                    
                switch (operador){
                    case "+":
                        resultado = calculadora.somar();
                        break;

                    case "-":
                        resultado = calculadora.subtrair();
                        break;
                    
                    case "*":
                        resultado = calculadora.multiplicacao();
                        break;
                    
                    case "/":
                        resultado = calculadora.divisao();
                        break;
                    
                    default:
                        System.out.println("Operador invalido.");
                        break;
                }
                System.out.println("= "+resultado);
            } catch(ArithmeticException e){
                System.out.println("Erro"+e);
            }
        }
    }
}