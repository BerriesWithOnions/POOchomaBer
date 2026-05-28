package listas.lista4.exercicio04;

public class ReservaService {

    public void reservar(Aluno aluno, Livro livro) throws Exception {
        if (aluno.getStatus() != StatusAluno.ATIVO) {
            throw new Exception("Reserva negada: aluno " + aluno.getNome()
                    + " está com status " + aluno.getStatus() + ".");
        }
        System.out.println("Reserva confirmada: \"" + livro.getTitulo()
                + "\" reservado para " + aluno.getNome() + " [ATIVO].");
    }
}
