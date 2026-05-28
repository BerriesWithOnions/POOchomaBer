package listas.lista4.exercicio01;


public class CadastroProdutoService {

    public void cadastrar(Usuario usuario, Produto produto) throws Exception {
        if (usuario.getTipo() != TipoUsuario.ADMIN) {
            throw new Exception("Acesso negado: apenas ADMIN pode cadastrar produtos.");
        }
        System.out.println("Produto '" + produto.getNome()
                + "' (R$" + produto.getPreco() + ")"
                + " cadastrado com sucesso por " + usuario.getNome() + " [ADMIN].");
    }
}
