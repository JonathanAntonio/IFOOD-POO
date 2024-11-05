package com.example.Entity;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class HistoricoEntrega extends Base {

    private int id;

    private ArrayList<StatusEntrega> statusEntrega;

    private ArrayList<Pedido> pedido;

    public HistoricoEntrega() {
    }

    public HistoricoEntrega(LocalDateTime dateCreated, int id, int status, String title, int id1, ArrayList<Pedido> pedido, ArrayList<StatusEntrega> statusEntrega) {
        super(dateCreated, id, status, title);
        this.id = id1;
        this.pedido = pedido;
        this.statusEntrega = statusEntrega;
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

    public ArrayList<StatusEntrega> getStatusEntrega() {
        return statusEntrega;
    }

    public void setStatusEntrega(ArrayList<StatusEntrega> statusEntrega) {
        this.statusEntrega = statusEntrega;
    }
}
