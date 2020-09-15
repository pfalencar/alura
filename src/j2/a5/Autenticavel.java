package j2.a5;
/*
 * INTERFACES não têm atributos, somente métodos.
 * Métodos não são implementados nas interfaces.
 */
public interface Autenticavel {
	
	//as classes que assinarem o contrato da interface 
	//devem implementar seus métodos.
	boolean autentica (int senha);
	
}
