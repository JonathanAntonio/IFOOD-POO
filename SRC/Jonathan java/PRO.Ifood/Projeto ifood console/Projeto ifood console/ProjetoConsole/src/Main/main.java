package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Carrinho;
import entities.Controller;

public class main {

	public static void main(String[] args) {
		Carrinho carrinho =new Carrinho();
		Controller controller=new Controller(carrinho);
		Scanner sc=new Scanner(System.in);

		while(true) {
		try {
		int opcao;
		
		do {
			System.out.println("MENU INICIAL IFOOD:");
			System.out.println("1-> Realizar pedido");
			System.out.println("2-> Exibir carrinho");
			System.out.println("3-> Finalizar pedido");
			System.out.println("4-> Exibir pedidos anteriores");
			System.out.println("5-> Sair");
			
			opcao=sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			case 1:{
				carrinho.fazerPedido();
				break;
			}
			case 2:{
				carrinho.exibirCarrinho();
				break;
				
			}
			case 3:{
				carrinho.finalizarPagamento();;
				break;
				
			}
			case 4:{
				controller.historicoPedidos();
				break;
				
			}
			case 5:{
			System.out.println("Saindo");
			break;
			}
			default:{
				System.out.println("Opção incorreta!");
				controller.pausar();
				break;
				
			}
			
			}
			
			
			
			
			
		}while(opcao!=5);
		
		break;
		
		
	}catch (InputMismatchException e) {
		System.out.println("Entrada de dados invalida!");
		controller.pausar();
	}
		catch (Exception e) {
		System.out.println("Erro inesperado!");
		controller.pausar();
	}
		}
		
	

}
}

