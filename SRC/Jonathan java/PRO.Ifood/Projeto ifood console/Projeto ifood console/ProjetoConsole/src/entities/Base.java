package entities;

import java.time.LocalDateTime;

public abstract class Base  {

protected int id;
protected String titulo;
protected LocalDateTime DataCriacao;


public Base(int id, String titulo, LocalDateTime dataCriacao) {
	this.id = id;
	this.titulo = titulo;
	DataCriacao = dataCriacao;
	
	
	
	
}





public Base() {
	super();
}





public Base(String titulo) {
	super();
	this.titulo = titulo;
}





public Base(String titulo, LocalDateTime dataCriacao) {
	super();
	this.titulo = titulo;
	DataCriacao = dataCriacao;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getTitulo() {
	return titulo;
}


public void setTitulo(String titulo) {
	this.titulo = titulo;
}


public LocalDateTime getDataCriacao() {
	return DataCriacao;
}


public void setDataCriacao(LocalDateTime dataCriacao) {
	DataCriacao = dataCriacao;
}

	
	
	
	
	
	
}
