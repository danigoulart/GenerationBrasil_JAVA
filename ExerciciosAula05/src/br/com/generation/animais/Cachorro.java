package br.com.generation.animais;

public class Cachorro extends Animais implements AcaoAnimal {

	@Override
	public void Correr() {
		System.out.println("Cachorrinho está correndinho...");
		
	}

	@Override
	public void comer() {
		System.out.println("Cachorrinho está comendinho...");
		
	}
		
	

}
