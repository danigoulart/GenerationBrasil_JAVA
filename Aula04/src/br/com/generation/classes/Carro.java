package br.com.generation.classes;

public class Carro {

	//Atributos que s�o variaveis 
	
	String marca;
	String modelo;
	int anoFabricacao;
	int velocidade;

	//Metodos que s�o as a��es/verbo 
	void acelarar(int aceleracao) {
		velocidade = velocidade + aceleracao;
	}
	//void freiar(int aceleracao) {
	//	velocidade = velocidade - aceleracao;
	//}
	
}
