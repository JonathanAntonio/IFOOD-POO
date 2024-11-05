package com.example.Entity;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido extends Base {

    private int id;

    private ArrayList<Promocao> promocao;

    private ArrayList<StatusEntrega> statusEntrega;

    private ArrayList<Restaurante> restaurante;

    private ArrayList<FormaPagamento> formaPagamento;

    private ArrayList<Endereco> endereco;

    private LocalDateTime data;

    private double valor;

    private double taxa_entrega;

    private String descricao;
    
    private double troco;

    public Pedido() {
    }

    public Pedido(LocalDateTime dateCreated, int id, int status, String title, LocalDateTime data, String descricao, ArrayList<Endereco> endereco, ArrayList<FormaPagamento> formaPagamento, int id1, ArrayList<Promocao> promocao, ArrayList<Restaurante> restaurante, ArrayList<StatusEntrega> statusEntrega, double taxa_entrega, double troco, double valor) {
        super(dateCreated, id, status, title);
        this.data = data;
        this.descricao = descricao;
        this.endereco = endereco;
        this.formaPagamento = formaPagamento;
        this.id = id1;
        this.promocao = promocao;
        this.restaurante = restaurante;
        this.statusEntrega = statusEntrega;
        this.taxa_entrega = taxa_entrega;
        this.troco = troco;
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTaxa_entrega() {
        return taxa_entrega;
    }

    public void setTaxa_entrega(double taxa_entrega) {
        this.taxa_entrega = taxa_entrega;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(ArrayList<Endereco> endereco) {
        this.endereco = endereco;
    }

    public ArrayList<FormaPagamento> getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(ArrayList<FormaPagamento> formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ArrayList<Promocao> getPromocao() {
        return promocao;
    }

    public void setPromocao(ArrayList<Promocao> promocao) {
        this.promocao = promocao;
    }

    public ArrayList<Restaurante> getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(ArrayList<Restaurante> restaurante) {
        this.restaurante = restaurante;
    }

    public ArrayList<StatusEntrega> getStatusEntrega() {
        return statusEntrega;
    }

    public void setStatusEntrega(ArrayList<StatusEntrega> statusEntrega) {
        this.statusEntrega = statusEntrega;
    }
}
