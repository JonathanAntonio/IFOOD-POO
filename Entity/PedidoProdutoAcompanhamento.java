package com.example.Entity;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class PedidoProdutoAcompanhamento extends Base{

    private ArrayList<PedidoProduto> pedidoProduto;

    private ArrayList<Acompanhamento> acompanhamento;

    public PedidoProdutoAcompanhamento() {
    }

    public PedidoProdutoAcompanhamento(LocalDateTime dateCreated, int id, int status, String title, ArrayList<Acompanhamento> acompanhamento, ArrayList<PedidoProduto> pedidoProduto) {
        super(dateCreated, id, status, title);
        this.acompanhamento = acompanhamento;
        this.pedidoProduto = pedidoProduto;
    }

    public ArrayList<Acompanhamento> getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(ArrayList<Acompanhamento> acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public ArrayList<PedidoProduto> getPedidoProduto() {
        return pedidoProduto;
    }

    public void setPedidoProduto(ArrayList<PedidoProduto> pedidoProduto) {
        this.pedidoProduto = pedidoProduto;
    }
}
