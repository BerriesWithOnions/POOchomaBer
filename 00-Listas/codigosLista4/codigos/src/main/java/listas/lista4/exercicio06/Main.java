package listas.lista4.exercicio06;


public class Main {
    public static void main(String[] args) {
        LancamentoNotaService service = new LancamentoNotaService();

        Professor profCC  = new Professor("Dr. João", "Ciência da Computação");
        Professor profEng = new Professor("Dra. Laura", "Engenharia de Software");

        Turma turmaCC  = new Turma("CC-2024-A", "Ciência da Computação");
        Turma turmaEng = new Turma("ES-2024-B", "Engenharia de Software");

        Nota nota = new Nota("Marcos", 8.5);

        try {
            service.lancarNota(profCC, turmaCC, nota);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            service.lancarNota(profCC, turmaEng, nota);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            service.lancarNota(profEng, turmaEng, nota);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
