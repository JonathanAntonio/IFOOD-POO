package Entity;

public class Avaliacao {

    private int id;

    private int nota;

    private Pedido pedido;

    private Restaurante restaurante;

    public Avaliacao() {
    }

    public Avaliacao(int id, int nota, Pedido pedido, Restaurante restaurante) {
        this.id = id;
        this.nota = nota;
        this.pedido = pedido;
        this.restaurante = restaurante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}
