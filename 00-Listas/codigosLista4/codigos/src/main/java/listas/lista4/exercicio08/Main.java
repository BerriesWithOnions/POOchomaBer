package listas.lista4.exercicio08;


public class Main {
    public static void main(String[] args) {
        PedidoService service = new PedidoService();

        Pedido pendente  = new Pedido(101, StatusPedido.PENDENTE);
        Pedido aprovado  = new Pedido(102, StatusPedido.APROVADO);
        Pedido enviado   = new Pedido(103, StatusPedido.ENVIADO);

        try {
            service.cancelar(pendente);
            System.out.println("Status atual: " + pendente.getStatus());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            service.cancelar(aprovado);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            service.cancelar(enviado);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
