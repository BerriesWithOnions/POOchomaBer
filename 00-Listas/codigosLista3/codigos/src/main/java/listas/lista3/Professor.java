package listas.lista3;

public class Professor extends Pessoa{
    private String disciplina;
    private double salario;

    public String getDisciplina() {
        return disciplina;
    }
    public double getSalario() {
        return salario;
    }

    public Professor(String nome, int idade, String disciplina, double salario){
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void exibirProfessor(){
        exibir();
        System.out.println("Disciplina: " + disciplina + " | Salário: " + salario);
    }
}
