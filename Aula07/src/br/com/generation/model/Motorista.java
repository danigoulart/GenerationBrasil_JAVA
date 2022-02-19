package br.com.generation.model;

import java.util.Optional;

public class Motorista {
	
	private String nome;
	private int idade;
	private Optional<Caminhao> caminhao; //precisa criar a entidade Caminhao
	
	public Motorista(String nome, int idade, Optional<Caminhao> caminhao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.caminhao = caminhao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Optional<Caminhao> getCaminhao() {
		return caminhao;
	}

	public void setCaminhao(Optional<Caminhao> caminhao) {
		this.caminhao = caminhao;
	}        
	
	
	
	
	

}
