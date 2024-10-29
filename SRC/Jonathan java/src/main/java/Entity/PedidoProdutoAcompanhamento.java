package Entity;

public class PedidoProdutoAcompanhamento {

    private PedidoProduto pedidoProduto;

    private Acompanhamento acompanhamento;

    public PedidoProdutoAcompanhamento() {
    }

    public PedidoProdutoAcompanhamento(Acompanhamento acompanhamento, PedidoProduto pedidoProduto) {
        this.acompanhamento = acompanhamento;
        this.pedidoProduto = pedidoProduto;
    }

    public Acompanhamento getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(Acompanhamento acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public PedidoProduto getPedidoProduto() {
        return pedidoProduto;
    }

    public void setPedidoProduto(PedidoProduto pedidoProduto) {
        this.pedidoProduto = pedidoProduto;
    }
}
