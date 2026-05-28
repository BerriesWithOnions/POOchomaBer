package listas.lista4.exercicio05;

public class TarefaService {

    public void concluir(Tarefa tarefa) throws Exception {
        if (tarefa.getStatus() != StatusTarefa.EM_ANDAMENTO) {
            throw new Exception("Não é possível concluir: tarefa \"" + tarefa.getNome()
                    + "\" está com status " + tarefa.getStatus() + ".");
        }
        tarefa.setStatus(StatusTarefa.CONCLUIDA);
        System.out.println("Tarefa \"" + tarefa.getNome() + "\" concluída com sucesso.");
    }
}
