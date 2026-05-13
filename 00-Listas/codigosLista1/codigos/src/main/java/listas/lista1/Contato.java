package listas.lista1;

public class Contato {
    
    private String nome;
    private String telefone;
    private String email;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void exibirContato() {
        System.out.println("Nome: " + nome);
        System.out.println("Tel: " + telefone);
        System.out.println("Email: " + email);
    }

    public void alterarTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
    }
}
