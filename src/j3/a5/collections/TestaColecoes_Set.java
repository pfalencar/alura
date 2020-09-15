package j3.a5.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * A interface Set só permite que um elemento seja adicionado uma única vez
 * dentro da sua coleção. Esse grupo de coleções que não aceita repetições se
 * chama "Set" Implementações possíveis para o Set: HashSet, Collections
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

		// Os métodos equal() e hashCode() usam só o Saldo para saber se a conta é
		// igual,
		// então, eles retornam o mesmo valor para c1 e c2, pq o saldo delas é igual.
		// Assim, o "HashSet" adiciona só uma das contas.

	}

}
