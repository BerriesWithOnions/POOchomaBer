class Carteirinha {
    private String numero;
    private String dataEmissao;

    public Carteirinha(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
    }

    public String getNumero() { 
        return numero; 
    }
    public void setNumero(String numero) { 
        this.numero = numero; 
    }
    public String getDataEmissao() { 
        return dataEmissao; 
    }
    
    public void setDataEmissao(String dataEmissao) { 
        this.dataEmissao = dataEmissao; 
    }
}