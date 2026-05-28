package listas.lista4.exercicio06;

public class LancamentoNotaService {

    public void lancarNota(Professor professor, Turma turma, Nota nota) throws Exception {
        if (!professor.getCurso().equalsIgnoreCase(turma.getCurso())) {
            throw new Exception("Lançamento negado: professor do curso \""
                    + professor.getCurso() + "\" não pode lançar nota na turma do curso \""
                    + turma.getCurso() + "\".");
        }
        System.out.println("Nota " + nota.getValor() + " lançada para " + nota.getNomeAluno()
                + " na turma \"" + turma.getNome() + "\" pelo Prof. " + professor.getNome() + ".");
    }
}
