package listas.lista4.exercicio08;

public class Pedido {
    private int numero;
    private StatusPedido status;

    public Pedido(int numero, StatusPedido status) {
        this.numero = numero;
        this.status = status;
    }

    public int getNumero() { return numero; }
    public StatusPedido getStatus() { return status; }
    public void setStatus(StatusPedido status) { this.status = status; }
}
