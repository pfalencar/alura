package j1.a2;

public class Visitante {

	public static void main(String[] args) {
		//Visitante.entrarNaFesta();
		//Visitante.aniversariar();
		//Visitante.multiplicar();
		Visitante.escolher();
	}
	
	public static void entrarNaFesta() {
		int idadeVisitante = 64;
		boolean amigoDoDono = true;
		
		if (idadeVisitante > 60) {
			System.out.println("Aproveite a melhor idade!");
		}else if (idadeVisitante >= 18 && amigoDoDono) {
			System.out.println("Entre na festa");
		} else {
			System.out.println("Volte pra casa");
		}
	}
	
	public static void aniversariar() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Parabéns pelo aniversário nº " + i);
		}
		
		int j = 1;
		while (j <= 100) {
			System.out.println("==> Parabéns pelo aniversário nº " + j);
			j++;
		}
	}
	
	public static void multiplicar() {		
		int multiplicador = 3;
		
		for (int i = 0; i < 10; i++) {
			
			if(i % 2 == 0) {
				int numeroQualquer = 10;
				System.out.println(i * multiplicador);
				System.out.println(numeroQualquer);
			}			
			System.out.println(multiplicador);
		}
	}
	
	public static void escolher() {
		int num = 5;
		switch(num) {
			case 1:
				System.out.println("um");
				break;
			case 2:
				System.out.println("dois");
				break;
			case 3: 
				System.out.println("três");
				break;
			case 4:
				System.out.println("quatro");
				break;
			case 5:
				System.out.println("cinco");
				break;
			case 6:
				System.out.println("seis");
				break;
			case 7:
				System.out.println("sete");
				break;
			default:
				System.out.println("Valor inválido!");				
		}
	}

}
