package br.com.generation.encapsulamento;

public class TestaCarro2 {

	public static void main(String[] args) {
		
		Carro2 ca1 = new Carro2();
		
		ca1.setModelo("Fusca");
		ca1.setMarca("Volks");
		ca1.setAnoFabricacao(1995);
		
		System.out.println("Modelo: " + ca1.getModelo());
		System.out.println("Marca: " + ca1.getMarca());
		System.out.println("Ano: " + ca1.getAnoFabricacao());
	}

}
