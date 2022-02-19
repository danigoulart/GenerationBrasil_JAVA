package objeto.java.aula05;

public class Aula05 {

	public static void main(String[] args) {
		
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("JUbileo");	
		p1.abrirConta("CC");
		
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("Creuza");
		p2.abrirConta("CP");
		
		System.out.println();
		
		p1.depositar(100);
		p2.depositar(500);
		p2.sacar(1000);
		System.out.println();
		
		p1.estadoAtual();
		System.out.println("===========");
		p2.estadoAtual();
	}

}
