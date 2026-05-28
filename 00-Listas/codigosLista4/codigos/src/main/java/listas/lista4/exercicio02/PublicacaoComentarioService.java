package listas.lista4.exercicio02;

public class PublicacaoComentarioService {

    public void publicar(Usuario usuario, Comentario comentario) throws Exception {
        if (usuario.getTipo() != TipoUsuario.PADRAO) {
            throw new Exception("Acesso negado: apenas usuários PADRAO podem publicar comentários.");
        }
        System.out.println("Comentário de " + usuario.getNome()
                + " publicado: \"" + comentario.getTexto() + "\"");
    }
}
