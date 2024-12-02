package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Produto extends Base {
private double preco;

	
	
	
	public Produto(int id, String titulo, LocalDateTime dataCriacao) {
		super(id, titulo, dataCriacao);
	}
	
	

	


	public Produto() {
		super();
	}






	public Produto(String titulo, LocalDateTime dataCriacao, double preco) {
		super(titulo, dataCriacao);
		this.preco = preco;
	}






	public double getPreco() {
		return preco;
	}






	@Override
	public String toString() {
		return "Produto [Preço->" + preco + " Nome->" + titulo + "]";
	}







	
	
}
