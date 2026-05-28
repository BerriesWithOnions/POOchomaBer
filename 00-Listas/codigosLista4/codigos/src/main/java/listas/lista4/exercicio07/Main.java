package listas.lista4.exercicio07;


public class Main {
    public static void main(String[] args) {
        AtividadeService service = new AtividadeService();

        Usuario maria   = new Usuario("Maria");
        Usuario pedro   = new Usuario("Pedro");

        Atividade atividade = new Atividade("Revisar documentação", maria);

        try {
            service.remover(maria, atividade);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            service.remover(pedro, atividade);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
