package listas.lista1;

public class Livro {
    
    private String titulo;
    private String autor;
    private boolean emprestado;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public boolean isEmprestado() {
        return emprestado;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void emprestarLivro() {
        if (emprestado == false) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("O livro está indisponível.");
        }
    }

    public void devolverLivro() {
        emprestado = false;
        System.out.println("Livro devolvido.");
    }

    public void verificarDisponibilidade() {
        if (emprestado == false){
            System.out.println("Indisponível");
        } else {
            System.out.println("Disponível");
        }
        
    }
}
