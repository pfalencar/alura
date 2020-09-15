package j3.a1.pkgs.programa;

import j3.a1.pkgs.modelo.Gerente;
import j3.a1.pkgs.modelo.TotalizadorDeBonus;

/*
 * 
 */
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Gerente joaquim = new Gerente();
		joaquim.setSalario(2000.0);
		joaquim.cobraFuncionario();
		
		System.out.println(joaquim.getBonus());
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adiciona(joaquim);
		
		System.out.println(totalizador.getTotal());
	}
}
