package listas.lista3;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public String getMatricula() {
        return matricula;
    }
    public String getCurso() {
        return curso;
    }
    public Aluno(String nome, int idade, String matricula, String curso) {
        super( nome,idade);
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public void exibirAluno(){
        exibir();
        System.out.println("Curso: " + this.curso + " | Matrícula: " + this.matricula);
    }
}
