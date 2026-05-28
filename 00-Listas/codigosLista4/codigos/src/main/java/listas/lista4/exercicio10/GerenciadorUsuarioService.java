package listas.lista4.exercicio10;


public class GerenciadorUsuarioService {

    public Usuario criarUsuario(Usuario executor, String nomeNovo, TipoUsuario tipoNovo) throws Exception {
        if (executor.getTipo() != TipoUsuario.ADMIN) {
            throw new Exception("Acesso negado: apenas ADMIN pode criar usuários.");
        }
        if (tipoNovo == TipoUsuario.ADMIN) {
            throw new Exception("Operação negada: ADMIN não pode criar outro usuário ADMIN.");
        }
        Usuario novoUsuario = new Usuario(nomeNovo, tipoNovo);
        System.out.println("Usuário \"" + novoUsuario.getNome() + "\" ["
                + novoUsuario.getTipo() + "] criado por " + executor.getNome() + " [ADMIN].");
        return novoUsuario;
    }
}
