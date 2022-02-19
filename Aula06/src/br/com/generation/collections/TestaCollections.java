package br.com.generation.collections;

import java.util.ArrayList;

public class TestaCollections {

	public static void main(String[] args) {

		String aula1 = "Bloco I - Java";
		String aula2 = "Bloco II - BackEnd";
		String aula3 = "Bloco III - FrondEnd";

		// Arraylist é uma classe.
		// aulas é um novo objeto
		ArrayList<String> aulas = new ArrayList<>(); // construtor
		aulas.add(aula1);
		aulas.add(aula1);
		aulas.add(aula2);

//		System.out.println(aulas);
//		
//		aulas.remove(1);
//		System.out.println(aulas);

		// for each, mais usado dentro de vetores, listas e matrizes
//		for(String i: aulas) {
//			System.out.println("Aula: " + i);
//			
//		}
//		System.out.println("_");
//		String primeiraAula =aulas.get(2);
//		System.out.println(primeiraAula);

		// System.out.println(aulas.get(0));
		
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println((i + 1) + " º Aulas: " + aulas.get(i));
		}

	}

}
