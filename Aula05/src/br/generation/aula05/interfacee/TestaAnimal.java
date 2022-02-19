package br.generation.aula05.interfacee;

public class TestaAnimal {

	public static void main(String[] args) {
	
		AnimalComer ac = new AnimalComer();
		
		ac.fazerAnimalComer(new Cachorro("Pluto"));
		ac.fazerAnimalComer(new Cavalo());
		
		
//		Cachorro dog1 = new Cachorro();
//		Cavalo cav1 = new Cavalo();
//		
//		dog1.somAnimal();
//		dog1.dormir();
//		dog1.comer();
//		
//		System.out.println();
//		
//		cav1.somAnimal();
//		cav1.dormir();
//		cav1.comer();
//		
//		System.out.println();
		
		
	}
	
		

}
