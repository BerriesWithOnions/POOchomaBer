package listas.lista4.exercicio02;

public class Main {
    public static void main(String[] args) {
        PublicacaoComentarioService service = new PublicacaoComentarioService();

        Usuario padrao = new Usuario("Carlos", TipoUsuario.PADRAO);
        Usuario admin  = new Usuario("Diana", TipoUsuario.ADMIN);

        Comentario comentario = new Comentario("Ótimo artigo!", padrao);

        try {
            service.publicar(padrao, comentario);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            service.publicar(admin, comentario);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
