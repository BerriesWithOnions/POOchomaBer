package listas.lista4.exercicio09;

public class SolicitacaoService {

    public void criar(Usuario usuario, Solicitacao solicitacao) {
        System.out.println("Solicitação \"" + solicitacao.getDescricao() + "\" criada por " + usuario.getNome() + " [" + usuario.getTipo() + "].");
    }

    public void aprovar(Usuario usuario, Solicitacao solicitacao) throws Exception {
        if (usuario.getTipo() != TipoUsuario.GERENTE) {
            throw new Exception("Aprovação negada: apenas GERENTE pode aprovar solicitações. " + usuario.getNome() + " é " + usuario.getTipo() + ".");
        }
        System.out.println("Solicitação \"" + solicitacao.getDescricao() + "\" aprovada por " + usuario.getNome() + " [GERENTE].");
    }
}
