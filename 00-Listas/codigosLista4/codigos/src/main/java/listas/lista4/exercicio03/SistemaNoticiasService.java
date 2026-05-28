package listas.lista4.exercicio03;

public class SistemaNoticiasService {

    public void visualizar(Usuario usuario, Noticia noticia) {
        System.out.println(usuario.getNome() + " [" + usuario.getTipo() + "] visualizou: \""
                + noticia.getTitulo() + "\" — " + noticia.getConteudo());
    }

    public void cadastrar(Usuario usuario, Noticia noticia) throws Exception {
        if (usuario.getTipo() == TipoUsuario.VISITANTE) {
            throw new Exception("Acesso negado: visitantes não podem cadastrar notícias.");
        }
        System.out.println("Notícia \"" + noticia.getTitulo()
                + "\" cadastrada por " + usuario.getNome() + " [" + usuario.getTipo() + "].");
    }
}
