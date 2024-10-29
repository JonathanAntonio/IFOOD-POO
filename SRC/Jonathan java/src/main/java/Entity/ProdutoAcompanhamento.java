package Entity;

public class ProdutoAcompanhamento {

    private Produto produto;

    private Acompanhamento acompanhamento;

    public ProdutoAcompanhamento() {
    }

    public ProdutoAcompanhamento(Acompanhamento acompanhamento, Produto produto) {
        this.acompanhamento = acompanhamento;
        this.produto = produto;
    }

    public Acompanhamento getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(Acompanhamento acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
