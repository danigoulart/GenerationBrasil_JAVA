package objeto.java.aula04;

public class Caneta {
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public Caneta(String m, String c, float p) { //metodo construtor
		this.modelo = m;
		this.ponta = p;
		this.tampar();
		this.cor = c;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	public void destampada() {
		this.tampada = false;
		
	}
	
	public String getModelo() {
		return this.modelo;
		
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	
	}
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void status() {
	System.out.println("Sobre a caneta:");
	System.out.println("Modelo: " + this.modelo);
	System.out.println("Ponta: " + this.ponta);
	System.out.println("cor: " + this.cor);
	System.out.println("Tampada: " + this.tampada);
	}
}
