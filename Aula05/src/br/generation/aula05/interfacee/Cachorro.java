package br.generation.aula05.interfacee;

public class Cachorro implements Animal{
			
	String nomeCachorro;
	
	 Cachorro(String nome){
		nomeCachorro = nome;
		System.out.println(nomeCachorro);
	}
	
	@Override // --> sobreescrita de método, polimorfismo
	public void somAnimal() {
		System.out.println("Som de cachorro auau");	
	}

	@Override // --> sobrescrita de método, polimorfismo
	public void dormir() {
		System.out.println("Cachorro dormindo... ZZzz");
			
	}

	@Override
	public void comer() {
		System.out.println("Cachorrin comendo, nham nham");
		
	}
	
	

	
	
	
	
}
