package Entity;

public class Restaurante {

    private int id;

    private String nome;

    private String telefone;

    private String horaFuncionamento;


    private boolean retirada;

    private Endereco endereco;

    private Categoria categoria;

    public Restaurante(int i) {
    }

    public Restaurante(Categoria categoria, Endereco endereco, String horaFuncionamento, int id, String nome, boolean retirada, String telefone) {
        this.categoria = categoria;
        this.endereco = endereco;
        this.horaFuncionamento = horaFuncionamento;
        this.id = id;
        this.nome = nome;
        this.retirada = retirada;
        this.telefone = telefone;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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
}
