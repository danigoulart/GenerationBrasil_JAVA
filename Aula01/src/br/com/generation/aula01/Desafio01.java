package br.com.generation.aula01;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double galoes, litros;
		
		System.out.println("Digite o número de galões que você tem: ");
		galoes = leia.nextInt();
		
		litros = galoes * 3.7854;
			
		System.out.println(galoes + " Galões são: " + litros + " Litros. ");

	}

}
