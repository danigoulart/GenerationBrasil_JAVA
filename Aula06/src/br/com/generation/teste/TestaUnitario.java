package br.com.generation.teste;

public class TestaUnitario {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		int resultadoEsperado = 4;
		double resultado = calc.somar(2, 2);
		if(resultado == resultadoEsperado) {
			System.out.println("Teste OK");
		}
		else {
			System.out.println("Teste Falhou");
		}

	}

}
