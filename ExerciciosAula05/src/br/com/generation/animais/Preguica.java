package br.com.generation.animais;

public class Preguica extends Animais implements AcaoAnimal {

	@Override
	public void Correr() {
		System.out.println("A preguiça não gosta de correr, ela está na árvore...");
		
	}

	@Override
	public void comer() {
		System.out.println("A preguiça está comendo...");
		
	}

}
