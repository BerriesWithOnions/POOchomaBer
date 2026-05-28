package listas.lista4.exercicio07;

public class AtividadeService {

    public void remover(Usuario usuario, Atividade atividade) throws Exception {
        if (!usuario.getNome().equalsIgnoreCase(atividade.getResponsavel().getNome())) {
            throw new Exception("Remoção negada: " + usuario.getNome() + " não é o responsável pela atividade \"" + atividade.getNome() + "\".");
        }
        System.out.println("Atividade \"" + atividade.getNome() + "\" removida por " + usuario.getNome() + " (responsável).");
    }
}
