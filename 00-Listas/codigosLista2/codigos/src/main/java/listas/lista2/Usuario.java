package listas.lista2;

public class Usuario {
    private String login;
    private String email;
    private Perfil perfil;

    public Usuario(String login, String email, Perfil perfil) {
        this.login = login;
        this.email = email;
        this.perfil = perfil;
    }

    public void exibirUsuario() {
        System.out.println("Usuário: " + login + " | Email: " + email);
        System.out.println("Perfil [Visibilidade: " + perfil.getVisibilidade() + "]: " + perfil.getBio());
        System.out.println("URL da Foto: " + perfil.getFoto());
    }
}
