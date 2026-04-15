package com.bernardo;

public class ContaCorrente extends ContaBancaria {
    
    private double limiteConta;
    
    public ContaCorrente(int id, int numeroConta, String titular, double limiteConta){
        super(id, numeroConta, titular);
        this.limiteConta = limiteConta;
    }

    public void exibirTitular(){
        System.out.println("O titular da conta é " + titular);
    }    

    @Override
    public void exibirTipoConta(){
        System.out.println("Conta Corrente");
    }    

    @Override
    public void sacar(double valor){
        if (getSaldo() + limiteConta >= valor){
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso");
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
            
        }

    public void setLimiteConta(double limiteConta) {
        this.limiteConta = limiteConta;
    }
    


}
