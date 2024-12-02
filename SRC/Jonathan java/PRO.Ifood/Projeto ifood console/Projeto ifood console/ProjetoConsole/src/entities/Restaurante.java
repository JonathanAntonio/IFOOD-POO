package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Restaurante extends Base {
	private List<Produto> listaProdutos =new ArrayList<>();
	private List<Restaurante> listaRestaurante = new ArrayList<>();

	@Override
	public String toString() {
		return titulo;
	}

	public Restaurante() {
		super();
		this.listaRestaurante = new ArrayList<>();
		this.listaProdutos = new ArrayList<>();
		adicionarRestaurante();
		adicionarProdutos();
	}

	public Restaurante(int id, String titulo, LocalDateTime dataCriacao) {
		super(id, titulo, dataCriacao);
	}

	public Restaurante(String titulo) {
		super(titulo);
	}

	public List<Restaurante> getListaRestaurante() {
		return listaRestaurante;
	}

	public void adicionarProduto(Produto p) {
		listaProdutos.add(p);
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void adicionarRestaurante() {
		Restaurante restauranteAzul = new Restaurante(1, "Restaurante Azul", LocalDateTime.now());
		Restaurante restauranteVerde = new Restaurante(2, "Restaurante Verde", LocalDateTime.now().plusDays(1));
		Restaurante restauranteVermelho = new Restaurante(3, "Restaurante Vermelho", LocalDateTime.now().minusDays(1));
		Restaurante restauranteAmarelo = new Restaurante(4, "Restaurante Amarelo", LocalDateTime.now().plusHours(3));
		Restaurante restauranteBranco = new Restaurante(5, "Restaurante Branco", LocalDateTime.now().minusHours(2));

		listaRestaurante.add(restauranteBranco);
		listaRestaurante.add(restauranteAmarelo);
		listaRestaurante.add(restauranteVermelho);
		listaRestaurante.add(restauranteVerde);
		listaRestaurante.add(restauranteAzul);

	}

	public void adicionarProdutos() {
		Produto RestAzulSopaCarne = new Produto("Sopa de Carne", LocalDateTime.now(), 15.0);
		Produto RestAzulPratoPeixe = new Produto("Prato de Peixe", LocalDateTime.now(), 20.0);
		Produto RestAzulBoloChocolate = new Produto("Bolo de Chocolate", LocalDateTime.now(), 12.0);
		Produto RestAzulSaladaVerde = new Produto("Salada Verde", LocalDateTime.now(), 10.0);
		Produto RestAzulSucoLaranja = new Produto("Suco de Laranja", LocalDateTime.now(), 8.0);

		

		Produto RestVerdeSopaLegumes = new Produto("Sopa de Legumes", LocalDateTime.now().plusDays(1), 18.0);
		Produto RestVerdePratoVegetariano = new Produto("Prato Vegetariano", LocalDateTime.now().plusDays(1), 22.5);
		Produto RestVerdeSaladaFrutas = new Produto("Salada de Frutas", LocalDateTime.now().plusDays(1), 15.0);
		Produto RestVerdeSucoVerdura = new Produto("Suco de Verdura", LocalDateTime.now().plusDays(1), 10.0);
		Produto RestVerdeTortaMaçã = new Produto("Torta de Maçã", LocalDateTime.now().plusDays(1), 12.0);


		Produto RestVermelhoBifeAngus = new Produto("Bife Angus", LocalDateTime.now().minusDays(1), 35.0);
		Produto RestVermelhoFeijoada = new Produto("Feijoada Completa", LocalDateTime.now().minusDays(1), 28.0);
		Produto RestVermelhoArrozCarreteiro = new Produto("Arroz Carreteiro", LocalDateTime.now().minusDays(1), 20.0);
		Produto RestVermelhoCervejaArtesanal = new Produto("Cerveja Artesanal", LocalDateTime.now().minusDays(1), 12.0);
		Produto RestVermelhoTiramisu = new Produto("Tiramisu", LocalDateTime.now().minusDays(1), 18.0);

		

		Produto RestAmareloSushi = new Produto("Sushi Tradicional", LocalDateTime.now().plusHours(3), 40.0);
		Produto RestAmareloTempura = new Produto("Tempura de Camarão", LocalDateTime.now().plusHours(3), 25.0);
		Produto RestAmareloYakimeshi = new Produto("Yakimeshi", LocalDateTime.now().plusHours(3), 30.0);
		Produto RestAmareloMatchaTiramisu = new Produto("Tiramisu de Matcha", LocalDateTime.now().plusHours(3), 15.0);
		Produto RestAmareloSopaMiso = new Produto("Sopa de Miso", LocalDateTime.now().plusHours(3), 12.0);


		Produto RestBrancoFrangoGrelhado = new Produto("Frango Grelhado", LocalDateTime.now().minusHours(2), 25.0);
		Produto RestBrancoBatataFrita = new Produto("Batata Frita", LocalDateTime.now().minusHours(2), 8.0);
		Produto RestBrancoEspagueteAlhoOleo = new Produto("Espaguete Alho e Óleo", LocalDateTime.now().minusHours(2),
				18.0);
		Produto RestBrancoPudim = new Produto("Pudim de Leite Condensado", LocalDateTime.now().minusHours(2), 10.0);
		Produto RestBrancoSucoAbacaxi = new Produto("Suco de Abacaxi", LocalDateTime.now().minusHours(2), 7.0);

	
		
		
		for (Restaurante restaurante : listaRestaurante) {
	        if (restaurante.getTitulo().equals("Restaurante Azul")) {
	            restaurante.adicionarProduto(RestAzulSopaCarne);
	            restaurante.adicionarProduto(RestAzulPratoPeixe);
	            restaurante.adicionarProduto(RestAzulBoloChocolate);
	            restaurante.adicionarProduto(RestAzulSaladaVerde);
	            restaurante.adicionarProduto(RestAzulSucoLaranja);
	        } else if (restaurante.getTitulo().equals("Restaurante Verde")) {
	            restaurante.adicionarProduto(RestVerdeSopaLegumes);
	            restaurante.adicionarProduto(RestVerdePratoVegetariano);
	            restaurante.adicionarProduto(RestVerdeSaladaFrutas);
	            restaurante.adicionarProduto(RestVerdeSucoVerdura);
	            restaurante.adicionarProduto(RestVerdeTortaMaçã);
	        } else if (restaurante.getTitulo().equals("Restaurante Vermelho")) {
	            restaurante.adicionarProduto(RestVermelhoBifeAngus);
	            restaurante.adicionarProduto(RestVermelhoFeijoada);
	            restaurante.adicionarProduto(RestVermelhoArrozCarreteiro);
	            restaurante.adicionarProduto(RestVermelhoCervejaArtesanal);
	            restaurante.adicionarProduto(RestVermelhoTiramisu);
	        } else if (restaurante.getTitulo().equals("Restaurante Amarelo")) {
	            restaurante.adicionarProduto(RestAmareloSushi);
	            restaurante.adicionarProduto(RestAmareloTempura);
	            restaurante.adicionarProduto(RestAmareloYakimeshi);
	            restaurante.adicionarProduto(RestAmareloMatchaTiramisu);
	            restaurante.adicionarProduto(RestAmareloSopaMiso);
	        } else if (restaurante.getTitulo().equals("Restaurante Branco")) {
	            restaurante.adicionarProduto(RestBrancoFrangoGrelhado);
	            restaurante.adicionarProduto(RestBrancoBatataFrita);
	            restaurante.adicionarProduto(RestBrancoEspagueteAlhoOleo);
	            restaurante.adicionarProduto(RestBrancoPudim);
	            restaurante.adicionarProduto(RestBrancoSucoAbacaxi);
	        }
	    }
	}
			

	}


