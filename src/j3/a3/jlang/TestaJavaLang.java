package j3.a3.jlang;

public class TestaJavaLang {
	
	public static void main(String[] args) {
		Conta c1 = new Conta(800.0);
		Conta c2 = new Conta(700.0);
		
		Cliente cli1 = new Cliente();
		Cliente cli2 = new Cliente();
		
		cli1.nome = "Joana";
		c1.setNumero(123);
		c1.setTitular(cli1);
		
		cli2.nome = "Maria";
		c2.setNumero(456);
				
		GuardadorDeObjetos go = new GuardadorDeObjetos();
		go.adiciona(c1);
		go.adiciona(c2);
		
		go.adiciona(cli1);
		go.adiciona(cli2);
		
		//Vai dar ClassCastException se não for mesmo uma conta que está aí.
		Conta c1NoArmario = (Conta) go.pega(1);
		Cliente cli1NoArmario = (Cliente) go.pega(2);
		
		System.out.println(c1);
		//System.out.println(c1NoArmario.getSaldo());
		
		//go.imprimirVetorDeContas();
		
		if (c1.equals(c2)) { 
			System.out.println("iguais");
		} else {
			System.out.println("Diferentes");
		}
		
		//OUTROS MÉTODOS DA CLASSE JAVA.LANG
		String curso = "fj11";
		curso = curso.replace("j", "k");
		curso = curso.toUpperCase();
		System.out.println(curso);
		
		double pi = 3.14;
		long numeroArredondado = Math.round(pi);
		System.out.println(numeroArredondado);
		
	}
}
