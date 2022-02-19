package br.com.generation.aula01;

public class Exemplo03 {

	public static void main(String[] args) {
		
		int var1;
		double var2; // tipo real
		
		var1 = 10;
		var2 = 10.0;
		
		System.out.println("O valor Original da 1ª variável: " + var1);
		System.out.println("O valor Original da 2ª variável: " + var2);
		
		System.out.println(); //quebra uma linha
		
		var1 = var1 / 4; //--> resultado apenas com número inteiro
		var2 = var2 / 4; //--> resultado apenas com número real
		
		
		System.out.println();
		
		System.out.println("O valor da 1ª variável após a divisão: " + var1);
		System.out.println("O valor da 2ª variável após a divisão: " + var2);
	}

}
