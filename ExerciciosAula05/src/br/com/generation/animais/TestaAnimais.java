package br.com.generation.animais;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro dog1 = new Cachorro();
		dog1.setNome("Tobias");
		dog1.setDormir("Mimindo Zzzzzz");
		dog1.setIdade(0);
		dog1.setSomAnimal("Auauauau");
		
		
		
		Cavalo cav1 = new Cavalo();
		cav1.setDormir("Mimindo... Zzzzz");
		cav1.setIdade(30);
		cav1.setNome("Jorjão");
		cav1.setSomAnimal("Ihiiihuuu");
		
		
		Preguica preg1 = new Preguica();
		preg1.setDormir("Zzzzzzzzzz");
		preg1.setIdade(50);
		preg1.setNome("Cleide");
		preg1.setSomAnimal("Grunhido");
		
		
		System.out.println("O som do " + dog1.getNome() + "é: " + dog1.getSomAnimal());

	}
	
		

}
