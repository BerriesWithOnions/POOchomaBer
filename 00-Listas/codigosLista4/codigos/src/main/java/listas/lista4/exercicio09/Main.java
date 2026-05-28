package listas.lista4.exercicio09;

public class Main {
    public static void main(String[] args) {
        SolicitacaoService service = new SolicitacaoService();

        Usuario padrao  = new Usuario("Natalia", TipoUsuario.PADRAO);
        Usuario gerente = new Usuario("Osvaldo", TipoUsuario.GERENTE);

        Solicitacao solicitacao = new Solicitacao("Aquisição de equipamentos", padrao);

        service.criar(padrao, solicitacao);
        service.criar(gerente, solicitacao);

        try {
            service.aprovar(gerente, solicitacao);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            service.aprovar(padrao, solicitacao);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
