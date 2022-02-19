package pratica.exercicios;

import java.util.Arrays;

public class Vetores02 {

	public static void main(String[] args) {
		// Trabalhando com FOR IT
		
		double v[] = {3.5, 2.75, 9, -4.5 };
		Arrays.sort(v); //vai colocar os vetores em ordem
		
		
		for (double valor: v) {
			System.out.print(valor + " ");	
		}
		System.out.println(" ");
	}

}
