package com.example.Entity;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ProdutoAcompanhamento extends Base {

    private ArrayList<Produto> produto;

    private ArrayList<Acompanhamento> acompanhamento;

    public ProdutoAcompanhamento() {
    }

    public ProdutoAcompanhamento(LocalDateTime dateCreated, int id, int status, String title, ArrayList<Acompanhamento> acompanhamento, ArrayList<Produto> produto) {
        super(dateCreated, id, status, title);
        this.acompanhamento = acompanhamento;
        this.produto = produto;
    }

    public ArrayList<Acompanhamento> getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(ArrayList<Acompanhamento> acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }
}
