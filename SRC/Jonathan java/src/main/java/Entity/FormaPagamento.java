package Entity;

public class FormaPagamento {

    private int id;

    private String tipo_de_pagamento;

    public FormaPagamento() {
    }

    public FormaPagamento(int id, String tipo_de_pagamento) {
        this.id = id;
        this.tipo_de_pagamento = tipo_de_pagamento;
    }

    public FormaPagamento(int i) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_de_pagamento() {
        return tipo_de_pagamento;
    }

    public void setTipo_de_pagamento(String tipo_de_pagamento) {
        this.tipo_de_pagamento = tipo_de_pagamento;
    }
}
