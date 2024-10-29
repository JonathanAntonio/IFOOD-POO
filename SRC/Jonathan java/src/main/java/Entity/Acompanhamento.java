package Entity;

public class Acompanhamento {

    private int id;

    private String nome;

    private String descricao;

    private double acompanhamento;


    public Acompanhamento() {
    }

    public Acompanhamento(double acompanhamento, String descricao, int id, String nome) {
        this.acompanhamento = acompanhamento;
        this.descricao = descricao;
        this.id = id;
        this.nome = nome;
    }

    public double getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(double acompanhamento) {
        this.acompanhamento = acompanhamento;
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
}
