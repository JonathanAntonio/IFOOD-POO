package com.example.Entity;
import java.time.LocalDateTime;

public class HistoricoPagamento {

    private int id;

    private LocalDateTime data;

    private FormaPagamento formaPagamento;

    private double valor;

    public HistoricoPagamento() {
    }

    public HistoricoPagamento(LocalDateTime data, FormaPagamento formaPagamento, int id, double valor) {
        this.data = data;
        this.formaPagamento = formaPagamento;
        this.id = id;
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
