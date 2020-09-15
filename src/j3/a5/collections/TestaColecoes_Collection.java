package j3.a5.collections;

import java.util.ArrayList;
import java.util.Collection;
/**
 * Collection é uma interface comum às implementações "HashSet" e "ArrayList"
 * @author Pati
 *
 */
public class TestaColecoes_Collection {

	public static void main(String[] args) {
		//Usando o HashSet adiciono sem repetição
//		Collection<Conta> contas = new HashSet<Conta>();
		
		//Com o ArrayList adiciono com repetição
		Collection<Conta> contas = new ArrayList<Conta>();

		Conta c1 = new Conta(500.0);
		Conta c2 = new Conta(200.0);

		contas.add(c1);
		contas.add(c1);
		contas.add(c2);

		System.out.println(contas.size());
		System.out.println(contas);

	}

}
