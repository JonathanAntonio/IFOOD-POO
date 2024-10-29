package Entity;

public class RestaurantePagamento {

    private Restaurante restaurante;

    private FormaPagamento pagamento;

    public RestaurantePagamento() {
    }

    public RestaurantePagamento(FormaPagamento pagamento, Restaurante restaurante) {
        this.pagamento = pagamento;
        this.restaurante = restaurante;
    }

    public FormaPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(FormaPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}
