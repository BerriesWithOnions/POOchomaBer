package listas.lista2;

public class CNPJ {
    private String numero;
    private String situacaoCadastral;

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getSituacaoCadastral() {
        return situacaoCadastral;
    }
    public void setSituacaoCadastral(String situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }
    
    public CNPJ(String numero, String situacaoCadastral) {
        this.numero = numero;
        this.situacaoCadastral = situacaoCadastral;
    }

}
