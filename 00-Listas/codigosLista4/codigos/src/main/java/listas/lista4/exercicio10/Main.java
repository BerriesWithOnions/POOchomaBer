package listas.lista4.exercicio10;


public class Main {
    public static void main(String[] args) {
        GerenciadorUsuarioService service = new GerenciadorUsuarioService();

        Usuario admin  = new Usuario("Patricia", TipoUsuario.ADMIN);
        Usuario padrao = new Usuario("Renato", TipoUsuario.PADRAO);

        try {
            service.criarUsuario(admin, "Sofia", TipoUsuario.PADRAO);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            service.criarUsuario(admin, "Tiago", TipoUsuario.ADMIN);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            service.criarUsuario(padrao, "Ursula", TipoUsuario.PADRAO);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
