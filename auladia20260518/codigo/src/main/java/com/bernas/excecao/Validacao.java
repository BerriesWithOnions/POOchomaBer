package com.bernas.excecao;

public class Validacao extends Exception{
    
    // Herança de uma classe que já tá implementada no java 

    public Validacao(String msgErro){
        super(msgErro);
    }
}
