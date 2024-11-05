package com.example.Entity;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Produto extends Base{

    private int id;

    private String nome;

    private String descricao;

    private double preco;

    private ArrayList<Categoria> categoria;

    private ArrayList<Restaurante> restaurante;

    public Produto() {
    }

    public Produto(LocalDateTime dateCreated, int id, int status, String title, ArrayList<Categoria> categoria, String descricao, int id1, String nome, double preco, ArrayList<Restaurante> restaurante) {
        super(dateCreated, id, status, title);
        this.categoria = categoria;
        this.descricao = descricao;
        this.id = id1;
        this.nome = nome;
        this.preco = preco;
        this.restaurante = restaurante;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(ArrayList<Categoria> categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Restaurante> getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(ArrayList<Restaurante> restaurante) {
        this.restaurante = restaurante;
    }
}
