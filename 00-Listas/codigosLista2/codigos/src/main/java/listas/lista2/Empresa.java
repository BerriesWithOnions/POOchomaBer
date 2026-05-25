package listas.lista2;

public class Empresa {
    private String razaoSocial;
    private String nomeFantasia;
    private CNPJ cnpj;

    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public CNPJ getCnpj() {
        return cnpj;
    }
    public void setCnpj(CNPJ cnpj) {
        this.cnpj = cnpj;
    }

    public Empresa(String razaoSocial, String nomeFantasia, CNPJ cnpj) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public void exibirEmpresa() {
        System.out.println("Empresa: " + nomeFantasia + " (" + razaoSocial + ")");
        System.out.println("CNPJ: " + cnpj.getNumero() + " | Status: " + cnpj.getSituacaoCadastral());
    }   

}