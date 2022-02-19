package pratica.heranca;

public class TestPess {

	public static void main(String[] args) {
		
		Pessoa jessica = new Pessoa("Jessica", 555);
		Funcionarios pedro = new Funcionarios("Pedro", 222, "TI");
		Pessoa maria = new Funcionarios("Maria", 333, "RH");
		Pessoa jose = new Coordenador("Jose", 444, "CC");
		
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());

	}

}
