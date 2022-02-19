package pratica.exercicios;

import java.util.Arrays;

public class Vetores03 {

	public static void main(String[] args) {
		
		int vet[] = {3, 7, 6, 1, 9, 4, 2};
		for (int v:vet) {
			System.out.println(v + " ");
		}
		System.out.println(" ");
		int p = Arrays.binarySearch(vet, 1); //um metódo que vai encontrar um indice dentro do vetor
		System.out.println("Encontrei o valor na posição " + p);
	}

}
