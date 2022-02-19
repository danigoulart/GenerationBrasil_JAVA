package br.com.generation.animais;

public class Cavalo extends Animais implements AcaoAnimal {

	@Override
	public void Correr() {
		System.out.println("Cavalinho está a correr...");
		
	}

	@Override
	public void comer() {
		System.out.println("Cavalinho está a comer....");
		
	}

}
