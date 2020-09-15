package j3.a5.collections;

import java.util.ArrayList;
import java.util.Collections;


public class TestaColecoes_ArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Patricia");
		nomes.add("Maria");
		
//		System.out.println(nomes.get(1));
//		System.out.println(nomes.contains("Patricia"));		
//		System.out.println(nomes);
		
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		//ordena em ordem alfabética
		Collections.sort(nomes);
		System.out.println("Ordenado!");
		
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		Conta c1 = new Conta(1200.0);
		Conta c2 = new Conta(800.0);
		
		contas.add(c1);
		contas.add(c2);
		
//		System.out.println(contas.get(1));
	
		for(Conta c: contas) {
			System.out.println(c); // retorna o resultado do método toString()
		}
		
		//comparando o saldo das contas por meio do método:  Conta.compareTo(Conta o) 
		Collections.sort(contas);
		System.out.println("Ordenado em ordem crescente de saldo na conta: ");
		for(Conta c: contas) {
			System.out.println(c); 
		}
		
		
	}

}
