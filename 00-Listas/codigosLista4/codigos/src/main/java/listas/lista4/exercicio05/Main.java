package listas.lista4.exercicio05;

public class Main {
    public static void main(String[] args) {
        TarefaService service = new TarefaService();

        Tarefa emAndamento = new Tarefa("Implementar login", StatusTarefa.EM_ANDAMENTO);
        Tarefa pendente    = new Tarefa("Escrever testes", StatusTarefa.PENDENTE);
        Tarefa cancelada   = new Tarefa("Refatorar módulo X", StatusTarefa.CANCELADA);

        try {
            service.concluir(emAndamento);
            System.out.println("Status atual: " + emAndamento.getStatus());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            service.concluir(pendente);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            service.concluir(cancelada);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
