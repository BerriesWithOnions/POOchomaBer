package com.exemplo.hellocontroller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensagemController {

    // RF01 – Mensagem padrão
    @GetMapping("/mensagem")
    public String mensagemPadrao() {
        return "Bem-vindo ao Spring Boot!";
    }

    // RF02 – Saudação personalizada
    @GetMapping("/mensagem/{nome}")
    public String saudaçãoPersonalizada(@PathVariable String nome) {
        return "Olá " + nome + ", seja bem-vindo!";
    }

    // RF03 – Nome da disciplina
    @GetMapping("/disciplina")
    public String nomeDisciplina() {
        return "Programação Orientada a Objetos";
    }

    // RF04 – Informar idade
    @GetMapping("/idade/{idade}")
    public String informarIdade(@PathVariable int idade) {
        return "Você possui " + idade + " anos.";
    }

    // RF05 – Soma de dois números
    @GetMapping("/soma/{numero1}/{numero2}")
    public String somarNumeros(@PathVariable int numero1, @PathVariable int numero2) {
        int resultado = numero1 + numero2;
        return "Resultado: " + resultado;
    }

    // --- DESAFIOS EXTRAS ---

    // Desafio Extra 1 – Multiplicação
    @GetMapping("/multiplicacao/{numero1}/{numero2}")
    public String multiplicarNumeros(@PathVariable int numero1, @PathVariable int numero2) {
        int resultado = numero1 * numero2;
        return "Resultado: " + resultado;
    }

    // Desafio Extra 2 – Tabuada
    @GetMapping("/tabuada/{numero}")
    public String exibirTabuada(@PathVariable int numero) {
        StringBuilder tabuada = new StringBuilder();
        
        for (int i = 1; i <= 10; i++) {
            tabuada.append(numero)
                   .append(" x ")
                   .append(i)
                   .append(" = ")
                   .append(numero * i)
                   .append("\n");
        }
        
        return tabuada.toString();
    }
}