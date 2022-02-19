package br.com.generation.maps;

import br.com.generation.model.Caminhao;
import br.com.generation.model.Motorista;
import br.com.generation.model.Seguro;
import br.com.generation.repository.Motoristas;


public class ConsultaCobertura {

	public static void main(String[] args) {
		
		Motoristas motoristas = new Motoristas();

	
			String cobertura = motoristas.porNome("João")
						.flatMap(Motorista::getCaminhao)						
						.flatMap(Caminhao::getSeguro)
						.map(Seguro::getCobertura)						
						.orElse("Sem Seguro!!");
				
				
			System.out.println("A cobertura é: " + cobertura);
	}

}
