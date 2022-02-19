package br.com.generation.classes;

public class TestaCarro {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		
		c1.modelo = "Corolla";
		c1.marca = "Toyota";
		c1.anoFabricacao = 2003;
		c1.velocidade = 0;
		
		//recebe por parametro aceleração
		c1.acelarar(120);
		System.out.println(" Velocidade: " + c1.velocidade);
		
		

	}

}
