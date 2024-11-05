package com.example.Entity;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Restaurante  extends Base{

    private int id;

    private String nome;

    private String telefone;

    private String horaFuncionamento;

    private boolean retirada;

    private ArrayList<Endereco> endereco;

    private ArrayList<Categoria> categoria;

    public Restaurante(int i) {
    }

    public Restaurante(LocalDateTime dateCreated, int id, int status, String title, ArrayList<Categoria> categoria, ArrayList<Endereco> endereco, String horaFuncionamento, int id1, String nome, boolean retirada, String telefone) {
        super(dateCreated, id, status, title);
        this.categoria = categoria;
        this.endereco = endereco;
        this.horaFuncionamento = horaFuncionamento;
        this.id = id1;
        this.nome = nome;
        this.retirada = retirada;
        this.telefone = telefone;
    }

    public String getHoraFuncionamento() {
        return horaFuncionamento;
    }

    public void setHoraFuncionamento(String horaFuncionamento) {
        this.horaFuncionamento = horaFuncionamento;
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

    public boolean isRetirada() {
        return retirada;
    }

    public void setRetirada(boolean retirada) {
        this.retirada = retirada;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(ArrayList<Categoria> categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(ArrayList<Endereco> endereco) {
        this.endereco = endereco;
    }
}
