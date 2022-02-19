package br.com.generation.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import br.com.generation.model.Caminhao;
import br.com.generation.model.Motorista;
import br.com.generation.model.Seguro;

public class Motoristas { //simulação do banco de dados 
	
	// passa o tipo de dado, a classe de onde ele vai pesquisar/receber os dados
	private  Map<String, Optional<Motorista>> motoristas = new HashMap<>();
	
	public Motoristas() {
		//sempre recebendo por parametro dos nossos construtores
		Seguro seguro = new Seguro("Parcial - Não cobre roubo! R$", 5000.000); //ctrl + shit + o para importar seguro do outro PACKPAGE
		Caminhao caminhao = new Caminhao("Mercedes benz", Optional.ofNullable(seguro)); //ta dizendo que é capaz do seguro ser nulo
		
		Optional<Motorista> motoristaJoao = Optional.of(new Motorista("João", 40, Optional.ofNullable(caminhao)));
		Optional<Motorista> motoristaJose = Optional.of(new Motorista("José", 25, Optional.ofNullable(null))); //null é vazio dentro do sistema
		
		motoristas.put("João", motoristaJoao); //passando a chave por parametro pq o map pede uma string, entao ela vai buscar Joao dentro do map
		motoristas.put("José", motoristaJose);
		
	}
	public Optional<Motorista> porNome(String nome) {
		return motoristas.get(nome);
	}
	
	

}
