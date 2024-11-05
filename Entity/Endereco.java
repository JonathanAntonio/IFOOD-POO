package com.example.Entity;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Endereco extends Base{

    private int id;                                    
          
    private String rua;

    private String bairro;

    private String cidade;

    private String Estado;

    private String CEP;

    private ArrayList<Promocao> promocao;

    public Endereco(LocalDateTime dateCreated, int id, int status, String title, String bairro, String CEP, String cidade, String estado, int id1, ArrayList<Promocao> promocao, String rua) {
        super(dateCreated, id, status, title);
        this.bairro = bairro;
        this.CEP = CEP;
        this.cidade = cidade;
        Estado = estado;
        this.id = id1;
        this.promocao = promocao;
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public int getId() {
        return (int) id;
    }

    public void setId(long id) {
        this.id = (int) id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }


    @Override
    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Promocao> getPromocao() {
        return promocao;
    }

    public void setPromocao(ArrayList<Promocao> promocao) {
        this.promocao = promocao;
    }
}