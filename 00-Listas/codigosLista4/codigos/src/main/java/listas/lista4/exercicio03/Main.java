package listas.lista4.exercicio03;

public class Main {
    public static void main(String[] args) {
        SistemaNoticiasService service = new SistemaNoticiasService();

        Usuario visitante = new Usuario("Eduardo", TipoUsuario.VISITANTE);
        Usuario redator   = new Usuario("Fernanda", TipoUsuario.REDATOR);
        Noticia noticia   = new Noticia("Java 21 lançado", "Nova versão traz records e pattern matching.");

        service.visualizar(visitante, noticia);

        service.visualizar(redator, noticia);

        try {
            service.cadastrar(redator, noticia);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            service.cadastrar(visitante, noticia);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
