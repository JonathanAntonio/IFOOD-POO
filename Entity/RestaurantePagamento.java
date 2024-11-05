package com.example.Entity;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RestaurantePagamento extends Base {

    private ArrayList<Restaurante> restaurante;

    private ArrayList<FormaPagamento> formaPagamentos;

    public RestaurantePagamento() {
    }

    public RestaurantePagamento(LocalDateTime dateCreated, int id, int status, String title, ArrayList<FormaPagamento> formaPagamentos, ArrayList<Restaurante> restaurante) {
        super(dateCreated, id, status, title);
        this.formaPagamentos = formaPagamentos;
        this.restaurante = restaurante;
    }

    public ArrayList<FormaPagamento> getFormaPagamentos() {
        return formaPagamentos;
    }

    public void setFormaPagamentos(ArrayList<FormaPagamento> formaPagamentos) {
        this.formaPagamentos = formaPagamentos;
    }

    public ArrayList<Restaurante> getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(ArrayList<Restaurante> restaurante) {
        this.restaurante = restaurante;
    }
}
