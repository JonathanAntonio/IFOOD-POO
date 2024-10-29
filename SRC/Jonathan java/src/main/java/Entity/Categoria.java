package Entity;

public class Categoria {

    private int id;

    private String tipo;

    private String nome;

    private String descricao;

    public Categoria() {
    }

    public Categoria(String descricao, int id, String nome, String tipo) {
        this.descricao = descricao;
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
