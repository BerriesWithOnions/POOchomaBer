package listas.lista2;

class CPF {
    private String numero;
    private String situacao;

    public CPF(String numero, String situacao) {
        this.numero = numero;
        this.situacao = situacao;
    }

    public String getNumero() { 
        return numero; 
    }
    public void setNumero(String numero) { 
        this.numero = numero;
    }
    public String getSituacao() { 
        return situacao; 
    }
    public void setSituacao(String situacao) { 
        this.situacao = situacao; 
    }

    public void exibirDados() {
        System.out.println("CPF: " + numero + " | Situação: " + situacao);
    }
}