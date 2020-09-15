package j3.a5.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * A interface Set s� permite que um elemento seja adicionado uma �nica vez
 * dentro da sua cole��o. Esse grupo de cole��es que n�o aceita repeti��es se
 * chama "Set" Implementa��es poss�veis para o Set: HashSet, Collections
 * 
 * @author Pati
 *
 */
public class TestaColecoes_Set {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		nomes.add("Patricia");
		nomes.add("Gabriela");
		nomes.add("Patricia");

//		System.out.println(nomes.size());
//		System.out.println(nomes);

		Set<Conta> contas = new HashSet<Conta>();

		Conta c1 = new Conta(200.0);
		Conta c2 = new Conta(200.0);

		contas.add(c1);
		contas.add(c1);
		contas.add(c2);

		System.out.println(contas.size());
		System.out.println(contas);

		// Os m�todos equal() e hashCode() usam s� o Saldo para saber se a conta �
		// igual,
		// ent�o, eles retornam o mesmo valor para c1 e c2, pq o saldo delas � igual.
		// Assim, o "HashSet" adiciona s� uma das contas.

	}

}
