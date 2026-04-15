package com.bernardo;

public abstract class ContaBancaria {

    // Classe abstrata tem tudo que uma classe tem E pelo menos um MÉTODO ABSTRATO
    private int id;
    private int numeroConta;
    protected String titular;
    private double saldo;

    public ContaBancaria(int id, int numeroConta, String titular){
        this.id = id;
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public int getId() {
        return id;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirTipoConta(){
        System.out.println("Conta Corrente");
    }    

    public abstract void sacar (double valor);


}
