package j3.a5.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * A interface List permite que o mesmo elemento seja adicionado 2 vezes na lista.
 * @author Pati
 *
 */
public class TestaColecoes_List {

	public static void main(String[] args) {
		//ArrayList implementa a interface List
		List<String> nomes = new ArrayList<String>();
		nomes.add("Pati");
		nomes.add("Joana");
		
//		System.out.println(nomes);
		
		//LinkedList (lista ligada) implementa a interface List 
		List<String> carros = new LinkedList<String>();
		carros.add("Fusca");
		carros.add("Fox");
		carros.add("Fusca");		
		carros.add("Fox");
		carros.add("Fusca");		
		
		System.out.println(carros.get(0));
//		System.out.println(carros.get(1));
		System.out.println(carros.get(2));
//		System.out.println(carros.get(3));
		System.out.println(carros.get(4));

	}

}
