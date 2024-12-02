package entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrinho {
	CorreiosAPI correios = new CorreiosAPI();
	Controller controller = new Controller();
	Scanner sc = new Scanner(System.in);
	Restaurante restaurante = new Restaurante();
	String path="Pedidos.txt";
	File arquivo=new File(path);
	private double total;
	final String cartao = "CARTÃO";
	final String pix = "PIX";
	final String dinheiro = "DINHEIRO";

	List<Object> carrinho = new ArrayList<>();

	public Carrinho() {
		this.total = total = 0;
	}

	public void acrescentarPedido(Produto p) {
		total += p.getPreco();
		this.carrinho.add(p);
	}

	public void fazerPedido() {
		try {
			System.out.println("Escolha o restaurante");
			int i = 0;
			for (Restaurante exibir : restaurante.getListaRestaurante()) {
				System.out.println(i + "->" + exibir);
				i++;
			}

			int ID = sc.nextInt();
			sc.nextLine();

			Restaurante restauranteEscolhido = restaurante.getListaRestaurante().get(ID);
			boolean continuar = true;
			int opcao;
			do {
				System.out.println("Escolha o produto do:" + restauranteEscolhido);
				int j = 0;
				for (Produto exibir : restauranteEscolhido.getListaProdutos()) {
					System.out.println(j + "-> " + exibir);
					j++;
				}
				ID = sc.nextInt();
				sc.nextLine();
				Produto produtoEscolhido = restauranteEscolhido.getListaProdutos().get(ID);

				acrescentarPedido(produtoEscolhido);
				System.out.println("Produto selecionado com sucesso!");
				System.out.println("Deseja selecionar outro produto:\n" + "1->Sim\n" + "2->Não\n");
				opcao = sc.nextInt();
				sc.nextLine();
				switch (opcao) {
				case 1: {
					continuar = true;
					break;
				}
				case 2: {
					continuar = false;
					break;
				}
				default: {
					System.out.println("Opção Incorreta!");
					System.out.println("Cancelando operação");
					continuar = false;
					break;
				}

				}

			} while (continuar != false);

			for (Object exibir : carrinho) {
				System.out.println(exibir);
			}
			System.out.println("Total: " + total);
			controller.pausar();

		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("ID invalido!");
		}
	}

	public void exibirCarrinho() {
		if(carrinho.isEmpty()) {
			System.out.println("O carrinho esta vazio!");
			controller.pausar();
			return;
		}
		
		for (Object exibir : carrinho) {
			System.out.println(exibir);
		}
		System.out.println("Total: " + total);
		controller.pausar();

	}

	public void finalizarPagamento() {
		if(carrinho.isEmpty()) {
			System.out.println("O carrinho esta vazio!");
			controller.pausar();
			return;
		}

		try {
			System.out.println("Digite o Cep de sua residencia");
			String cep = sc.nextLine();
			correios.consultarCep(cep);
			boolean escolhaCorrera = false;
			String formaPagamento = "";
			int opcao;
			do {
				System.out.println("Escolha a maneira de pagamento");
				System.out.println("1-> Cartão");
				System.out.println("2-> Pix");
				System.out.println("3-> Dinheiro");
				opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {
				case 1: {
					formaPagamento = cartao;
					break;
				}
				case 2: {
					formaPagamento = pix;
					break;
				}
				case 3: {
					formaPagamento = dinheiro;
					break;
				}
				default: {
					System.out.println("opcão incorreta!");
					break;
				}
				}
			} while (escolhaCorrera != false);
			System.out.println("Metodo de Pagamento escolhida-> " + formaPagamento);

			System.out.println("Aguarde a entrega!");
			final String preparando = "O produto esta em produção";
			final String caminho = "O produto esta a caminho do seu endereço";
			final String entregue = "O produto foi entregue";

			String[] status = { preparando, caminho, entregue };

			for (int i = 0; i < 3; i++) {
				System.out.println(status[i]);
				Thread.sleep(10000);
			}
			System.out.println("Pedido finalizado");
			
			try(BufferedWriter bw=new BufferedWriter(new FileWriter(arquivo,true))){
				LocalDate ld=LocalDate.now();
				for(Object escrever:carrinho) {
					bw.write(escrever.toString()+ld);
					bw.newLine();
				}
				carrinho.removeAll(carrinho);
				
				
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
			
			
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
