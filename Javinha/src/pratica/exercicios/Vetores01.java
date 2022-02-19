package pratica.exercicios;

public class Vetores01 {

	public static void main(String[] args) {
		
		String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai",
				"Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		int totDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for (int c=0; c<mes.length; c++) {
			System.out.println("O mês de " + mes[c] + " tem " + totDias[c] + " dias ao todo!");
			
			
		}

	}

}
