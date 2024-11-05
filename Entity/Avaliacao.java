package com.example.Entity;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Avaliacao extends Base{

    private int id;

    private int nota;

    private Pedido pedido;

    private ArrayList<Restaurante> restaurante;

    public Avaliacao() {
    }

    public Avaliacao(LocalDateTime dateCreated, int id, int status, String title, int id1, int nota, Pedido pedido, ArrayList<Restaurante> restaurante) {
        super(dateCreated, id, status, title);
        this.id = id1;
        this.nota = nota;
        this.pedido = pedido;
        this.restaurante = restaurante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public ArrayList<Restaurante> getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(ArrayList<Restaurante> restaurante) {
        this.restaurante = restaurante;
    }
}
