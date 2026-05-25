package listas.lista2;

class Aluno {
    private String nome;
    private String curso;
    private Carteirinha carteirinha;

    public Aluno(String nome, String curso, Carteirinha carteirinha) {
        this.nome = nome;
        this.curso = curso;
        this.carteirinha = carteirinha;
    }

    public String getNome() { 
        return nome; 
    }
    public void setNome(String nome) { 
        this.nome = nome; 
    }
    public String getCurso() { 
        return curso; 
    }
    public void setCurso(String curso) { 
        this.curso = curso; 
    }
    public Carteirinha getCarteirinha() { 
        return carteirinha; 
    }
    public void setCarteirinha(Carteirinha carteirinha) { 
        this.carteirinha = carteirinha; 
    }

    public void exibirAluno() {
        System.out.println("Aluno: " + nome + " | Curso: " + curso);
        System.out.println("Carteirinha Nº: " + carteirinha.getNumero() + " | Emissão: " + carteirinha.getDataEmissao());
    }
}