package Entity;

public class HistoricoEntrega {

    private int id;

    private StatusEntrega statusEntrega;

    private Pedido pedido;

    public HistoricoEntrega() {
    }

    public HistoricoEntrega(int id, Pedido pedido, StatusEntrega statusEntrega) {
        this.id = id;
        this.pedido = pedido;
        this.statusEntrega = statusEntrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public StatusEntrega getStatusEntrega() {
        return statusEntrega;
    }

    public void setStatusEntrega(StatusEntrega statusEntrega) {
        this.statusEntrega = statusEntrega;
    }
}
