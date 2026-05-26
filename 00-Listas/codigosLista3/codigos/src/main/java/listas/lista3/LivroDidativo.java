package listas.lista3;

public class LivroDidativo extends Livro {
    
    public LivroDidativo(String titulo, String autor, String disciplina) {
        super(titulo, autor);
        this.disciplina = disciplina;
    }

    public String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public void exibir() {
        System.out.println("Livro Didático: " + titulo + " - " + autor + " | Disciplina: " + disciplina);
    }
}
