package com.choma; // Java acessa pastas com .

public class Livro {
    
    // Atributos da classe Livro (não esquecer o encapsulamento - não colocar nada é público)
    private String titulo;
    private String autor;
    private int anoPub;
    private boolean disponivel;
    // Por que tudo privado? Porque quero alterar os atributos SOMENTE nos métodos da classe
    
    // Construtor da classe Livro (escrever = set, ler = get)
    public Livro(String titulo, String autor, int anoPub) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPub = anoPub;
        this.disponivel = true;
    }
    
    // métodos
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }
    
    public void setAnoPub(int anoPub){
        this.anoPub = anoPub;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar(){
        if (disponivel){
            disponivel = false;
            System.out.println("O livro "+titulo+" foi emprestado");
        } else {
            System.out.println("O livro "+titulo+" não está disponível.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("O livro " + this.titulo + " foi devolvido com sucesso!");
    }

    @Override
    public String toString() {
            return "Livro{" +
                    "titulo='" + titulo + '\'' +
                    ", autor='" + autor + '\'' +
                    ", anoPublicacao=" + anoPub +
                    ", disponivel=" + disponivel +
                    '}';
    }
}

