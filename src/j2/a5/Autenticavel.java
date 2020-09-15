package j2.a5;
/*
 * INTERFACES n�o t�m atributos, somente m�todos.
 * M�todos n�o s�o implementados nas interfaces.
 */
public interface Autenticavel {
	
	//as classes que assinarem o contrato da interface 
	//devem implementar seus m�todos.
	boolean autentica (int senha);
	
}
