package br.com.generation.aula01;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);      // declarando a entrada do usuario como leia importando a biblioteca
		
		int a, b, soma;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();        //vai pedir pro usuario digitar um núm INTEIRO e arm na var a
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();        //vai pedir pro usuario digitar um núm INTEIRO e arm na var b
		
		soma = a + b;
		

		System.out.println("A soma de A + B é: " + soma);      	//vai imprimir o resultado da soma das variaveis 
		
		leia.close();
		
		
	}

}
