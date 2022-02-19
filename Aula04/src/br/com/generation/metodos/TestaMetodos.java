package br.com.generation.metodos;

import java.util.Scanner;

public class TestaMetodos {

	static int soma2;
	static int num1 = 5;
	static int num2 = 3;
	static int mult; 
	static int numero1, numero2;
	
	
	public static void main(String[] args) {
		
		metodo0();
		metodo1();
		metodo2();
		metodo3();
		metodo4();	
		metodo5(numero1, numero2);
		metodo7();
	}
	
	public static void metodo0() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número 1: ");
		numero1 = entrada.nextInt();
		System.out.println("Digite o número 2: ");
		numero2 = entrada.nextInt();
		
	}

	public static void metodo1() {
		System.out.println("Eu sou o Método 1");

	}

	public static void metodo2() {
		double soma = 0.0, numero1 = 10., numero2 = 30.0;
		soma = numero1 + numero2;
		System.out.println("Resultado da Soma no Método 2: " + soma);

	}

	public static void metodo3() {
		soma2 = num1 + num2;
		System.out.println();
	}
	
	public static void metodo4() {
		System.out.println("Resultado da soma do Metodo3 no Metodo4: " + soma2);
	}
	
	public static void metodo5(int n1, int n2) {
		mult = n1 * n2;
		System.out.println("Resultado da multiplicação no Metodo5: " + mult);
		
	}
	
	public static void metodo7() {
		System.out.println(MetodosFora.metodo6(0, 10));
		
	}
	
}
