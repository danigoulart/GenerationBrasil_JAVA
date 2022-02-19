package br.com.generation.exeption;

public class Exeption {

	public static void main(String[] args) {

		int[] vetor = new int[4];

		System.out.println("Antes da Exeption");

		try {
			vetor[4] = 10;
		}
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Exception consertada");
		}
	}

}
