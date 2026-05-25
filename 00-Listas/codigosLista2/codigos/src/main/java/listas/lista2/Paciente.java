package listas.lista2;

public class Paciente {
    private String nome;
    private int idade;
    private Prontuario prontuario;

    public Paciente(String nome, int idade, Prontuario prontuario) {
        this.nome = nome;
        this.idade = idade;
        this.prontuario = prontuario;
    }

    public void exibirPaciente() {
        System.out.println("Paciente: " + nome + " | Idade: " + idade);
        System.out.println("Prontuário Nº: " + prontuario.getNumeroRegistro() + " | Tipo Sanguíneo: " + prontuario.getTipoSanguineo());
        System.out.println("Alergias: " + prontuario.getAlergias());
    }
}
