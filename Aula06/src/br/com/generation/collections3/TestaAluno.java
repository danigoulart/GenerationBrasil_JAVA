package br.com.generation.collections3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		System.out.println("Quantos alunos você desejar adicionar: ");
		int numeroAlunos = sc.nextInt();
		sc.nextLine(); // vai rodar mais uma vez e pular uma linha
		
		for(int i = 0; i < numeroAlunos; i++) {
			
			System.out.println("Digite a Idade do Aluno: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Digite o Nome do Aluno: ");
			String nome = sc.next();
			
			alunos.add(new Aluno(idade,nome));				
		}
		for (Aluno i: alunos) {
			System.out.println(i);
		}
	}

}
