package br.generation.aula05;

import java.util.Scanner;

public class TestaTodoMundo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome do funcionário: ");
		String nome = entrada.next();
		System.out.println("Digite a idade: ");
		int idade = entrada.nextInt();
		System.out.println("Digite o seu salário: ");
		double salario = entrada.nextInt();
		
		Professor pf1 = new Professor();
		
		pf1.setNome(nome);
		pf1.setIdade(idade);
		pf1.setEndereço("Rua 2 de Julho - nº 30");
		pf1.setDisciplina("história");
		
//		double salarioModificado = salario * 1.10;
//		pf1.setSalario(salarioModificado);
		
		System.out.println("Nome: " + pf1.getNome());
		System.out.println("Idade:" + pf1.getIdade());
		System.out.println("Endereço: " + pf1.getEndereço());
		System.out.println("Disciplina: " + pf1.getDisciplina());
		System.out.println("Salário: " + pf1.getSalario());
	}

}
