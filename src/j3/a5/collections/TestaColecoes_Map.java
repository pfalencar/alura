package j3.a5.collections;

import java.util.HashMap;
import java.util.Map;
/**
 * O HashMap é uma implementção de Map que permite adicionar sem repetição por meio de chave e valor.
 * @author Pati
 *
 */
public class TestaColecoes_Map {

	public static void main(String[] args) {
		Map<String, Conta> contas = new HashMap<String, Conta>();

		Conta c1 = new Conta(500.0);
		Conta c2 = new Conta(200.0);

		contas.put("diretor", c1);
		contas.put("gerente", c2);
		contas.put("gerente", c2);

		System.out.println(contas.size());
		System.out.println(contas.get("diretor"));
		System.out.println(contas.get("gerente").getSaldo());

	}

}
