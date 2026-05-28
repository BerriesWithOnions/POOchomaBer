package listas.lista4.exercicio04;

public class Main {
    public static void main(String[] args) {
        ReservaService service = new ReservaService();

        Aluno ativo    = new Aluno("Gabriel", StatusAluno.ATIVO);
        Aluno suspenso = new Aluno("Helena", StatusAluno.SUSPENSO);
        Aluno inativo  = new Aluno("Igor", StatusAluno.INATIVO);
        Livro livro    = new Livro("Clean Code", "Robert C. Martin");

        try {
            service.reservar(ativo, livro);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            service.reservar(suspenso, livro);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            service.reservar(inativo, livro);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
