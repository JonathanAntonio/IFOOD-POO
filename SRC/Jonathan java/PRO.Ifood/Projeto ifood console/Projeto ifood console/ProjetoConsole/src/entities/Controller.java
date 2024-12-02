package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Controller {
	Scanner sc=new Scanner (System.in);
	Carrinho carrinho;
	
	public void pausar() {
		System.out.println("Pressione enter para continuar!");
		sc.nextLine();
	}

	public Controller(Carrinho carrinho) {
		super();
		this.carrinho=carrinho;
	}

	public Controller() {
		super();
	}
	public void historicoPedidos() {
		if(carrinho.arquivo.length()==0) {
			System.out.println("Não ha historico de pedidos!");
			pausar();
			return;
		}
		
		
		try(BufferedReader br=new BufferedReader(new FileReader(carrinho.path))){
		String line=br.readLine();
		System.out.println("Pedidos Realizados: 1");
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		pausar();
			
			
			
			
			
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	
	
	
	
	

}
