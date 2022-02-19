package br.com.generation.loja;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleEstoque {

	public static void main(String[] args) {
		
		ArrayList <Estoque> estoque = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		
		
		System.out.println("Quantos produtos gostaria de inserir?");
		int qnt = sc2.nextInt();
		
		for(int i =0; i <qnt; i++) {
			System.out.println("Qual produto você deseja incluir? ");
			String produto = sc.next();
			System.out.println("Quantos você deseja adicionar ao estoque?");
			 int quantidade = sc2.nextInt();
			 
			estoque.add(new Estoque(produto, quantidade));
		}
		
		System.out.println("Você deseja remover algum item do estoque? Digite [1] para SIM ou [2] para NÃO");
		qnt = sc2.nextInt();
		while (qnt == 1) {
			for(int i = 0; i<estoque.size(); i++) {
				System.out.println("Em estoque: " + estoque.get(i));
			}
			System.out.println("Qual produto você gostaria de remover? ");
			int remove = sc2.nextInt();
			estoque.remove(remove);
			System.out.println("Você deseja remover mais algum item do estoque? Digite [1] para SIM ou [2] para NÃO");
			qnt = sc2.nextInt();
		}
			
		for(int i = 0; i<estoque.size(); i++) {
			System.out.println("Em estoque: " + estoque.get(i));
		}
		

	}

}
