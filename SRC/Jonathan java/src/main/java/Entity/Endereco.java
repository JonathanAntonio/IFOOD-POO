package Entity;


public class Endereco {

    private int id;                                    
          
    private String rua;

    private String bairro;

    private String cidade;

    private String Estado;

    private String CEP;

    private Promocao promocao;

    public Endereco(int i) {
    }

    public Endereco(String bairro, String CEP, String cidade, String estado, int id, Promocao promocao, String rua) {
        this.bairro = bairro;
        this.CEP = CEP;
        this.cidade = cidade;
        Estado = estado;
        this.id = (int) id;
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

    public Promocao getPromocao() {
        return promocao;
    }

    public void setPromocao(Promocao promocao) {
        this.promocao = promocao;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}