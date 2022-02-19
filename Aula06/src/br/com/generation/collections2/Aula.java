package br.com.generation.collections2;

public class Aula {
		//atributos - variaveis
		private String titulo;
		private int tempo;
		
		//construtor da classe
		public Aula(String titulo, int tempo) {
			super();
			this.titulo = titulo;
			this.tempo = tempo;
		}
		//metodos de acesso e recuperação (getters and Setters)
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public int getTempo() {
			return tempo;
		}
		public void setTempo(int tempo) {
			this.tempo = tempo;
		}
		
		public String toString() {
			return "\nAula: " + this.titulo + " | " + this.tempo + " minutos. ";
			
		}
		
}
