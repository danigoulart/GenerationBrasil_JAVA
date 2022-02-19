package br.com.generation.classes;

public class TestaAluno {

	public static void main(String[] args) {

		// al1 nome do objeto pra poder utilizar, declarando
		Aluno al1 = new Aluno();
		Aluno al2 = new Aluno();

		al1.nome = "Luana";
		al1.idade = 18;
		al1.endereco = "Rua: Pajé - 304";
		
		al2.nome = "Joao";
		al2.idade = 20;
		al2.endereco = "Rua tradição, 50 ";
		
		System.out.println(al1.nome);
		System.out.println(al1.idade);
		System.out.println(al1.endereco);
		al1.estudar();
		al1.fazerProva();
		
		System.out.println(al2.nome);
		System.out.println(al2.idade);
		System.out.println(al2.endereco);
		al2.estudar();
		al2.fazerProva();
		
	}

}
