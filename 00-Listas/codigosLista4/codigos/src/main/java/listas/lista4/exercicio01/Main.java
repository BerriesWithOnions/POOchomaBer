package listas.lista4.exercicio01;


public class Main {
    public static void main(String[] args) {
        CadastroProdutoService service = new CadastroProdutoService();

        Usuario admin  = new Usuario("Alice", TipoUsuario.ADMIN);
        Usuario padrao = new Usuario("Bruno", TipoUsuario.PADRAO);
        Produto produto = new Produto("Notebook", 3500.00);

        try {
            service.cadastrar(admin, produto);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            service.cadastrar(padrao, produto);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
