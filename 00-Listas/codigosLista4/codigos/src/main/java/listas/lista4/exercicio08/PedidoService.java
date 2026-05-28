package listas.lista4.exercicio08;

public class PedidoService {

    public void cancelar(Pedido pedido) throws Exception {
        if (pedido.getStatus() != StatusPedido.PENDENTE) {
            throw new Exception("Cancelamento negado: pedido #" + pedido.getNumero()
                    + " está com status " + pedido.getStatus() + ".");
        }
        pedido.setStatus(StatusPedido.CANCELADO);
        System.out.println("Pedido #" + pedido.getNumero() + " cancelado com sucesso.");
    }
}
