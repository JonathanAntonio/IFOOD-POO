package Entity;

public class PedidoProduto {

    private int id;

    private Pedido pedido;

    private Produto produto;

    public PedidoProduto() {
    }

    public PedidoProduto(int id, Pedido pedido, Produto produto) {
        this.id = id;
        this.pedido = pedido;
        this.produto = produto;
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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


}
