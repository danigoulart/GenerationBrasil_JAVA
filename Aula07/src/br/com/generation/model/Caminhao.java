package br.com.generation.model;

import java.util.Optional;

public class Caminhao { //criando a entidade Caminhao
	
	private String modelo;
	private Optional<Seguro> seguro; //precisa criar a entidade seguro
	
	
	public Caminhao(String modelo, Optional<Seguro> seguro) {
		super();
		this.modelo = modelo;
		this.seguro = seguro;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Optional<Seguro> getSeguro() {
		return seguro;
	}
	public void setSeguro(Optional<Seguro> seguro) {
		this.seguro = seguro;
	}
	
	
	 

}
