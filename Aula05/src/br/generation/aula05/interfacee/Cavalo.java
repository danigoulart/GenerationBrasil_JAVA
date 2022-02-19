package br.generation.aula05.interfacee;

public class Cavalo implements Animal {

	@Override
	public void somAnimal() {
		System.out.println("O som do cavalo é: iiiihiiiii");
		
	}

	@Override
	public void dormir() {
		System.out.println("Cavalo a mimir... Zzzz");
		
	}

	@Override
	public void comer() {
		System.out.println("Cavalo comendinho grama, nhac nhac");
		
	}

	
	
}
