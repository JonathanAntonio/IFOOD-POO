package com.example.Entity;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class PedidoProduto extends Base{

    private int id;

    private ArrayList<Pedido> pedido;

    private ArrayList<Produto> produto;

    public PedidoProduto() {
    }

    public PedidoProduto(LocalDateTime dateCreated, int id, int status, String title, int id1, ArrayList<Pedido> pedido, ArrayList<Produto> produto) {
        super(dateCreated, id, status, title);
        this.id = id1;
        this.pedido = pedido;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Pedido> pedido) {
        this.pedido = pedido;
    }

    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }


}
