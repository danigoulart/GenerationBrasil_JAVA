package br.com.generation.classes;

public class Carro {

	//Atributos que são variaveis 
	
	String marca;
	String modelo;
	int anoFabricacao;
	int velocidade;

	//Metodos que são as ações/verbo 
	void acelarar(int aceleracao) {
		velocidade = velocidade + aceleracao;
	}
	//void freiar(int aceleracao) {
	//	velocidade = velocidade - aceleracao;
	//}
	
}
