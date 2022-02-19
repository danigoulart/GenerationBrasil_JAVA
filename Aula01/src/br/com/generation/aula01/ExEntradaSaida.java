package br.com.generation.aula01;

import java.util.Scanner;

public class ExEntradaSaida {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		double a, b, soma, divisao, mult, difer;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		
		soma = a + b;
		divisao = a / b;
		mult = a * b;
		difer = a % b;
		
		System.out.println("A soma de A e B é :" + soma);
		System.out.println("A divisão de A e B é: " + divisao);
		System.out.println("A multiplicação de A e B é: " + mult);
		System.out.println("A diferença de A e B é: " + difer);
		
		leia.close();
		
	}
}