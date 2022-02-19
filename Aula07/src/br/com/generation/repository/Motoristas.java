package br.com.generation.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import br.com.generation.model.Caminhao;
import br.com.generation.model.Motorista;
import br.com.generation.model.Seguro;

public class Motoristas { //simula��o do banco de dados 
	
	// passa o tipo de dado, a classe de onde ele vai pesquisar/receber os dados
	private  Map<String, Optional<Motorista>> motoristas = new HashMap<>();
	
	public Motoristas() {
		//sempre recebendo por parametro dos nossos construtores
		Seguro seguro = new Seguro("Parcial - N�o cobre roubo! R$", 5000.000); //ctrl + shit + o para importar seguro do outro PACKPAGE
		Caminhao caminhao = new Caminhao("Mercedes benz", Optional.ofNullable(seguro)); //ta dizendo que � capaz do seguro ser nulo
		
		Optional<Motorista> motoristaJoao = Optional.of(new Motorista("Jo�o", 40, Optional.ofNullable(caminhao)));
		Optional<Motorista> motoristaJose = Optional.of(new Motorista("Jos�", 25, Optional.ofNullable(null))); //null � vazio dentro do sistema
		
		motoristas.put("Jo�o", motoristaJoao); //passando a chave por parametro pq o map pede uma string, entao ela vai buscar Joao dentro do map
		motoristas.put("Jos�", motoristaJose);
		
	}
	public Optional<Motorista> porNome(String nome) {
		return motoristas.get(nome);
	}
	
	

}
