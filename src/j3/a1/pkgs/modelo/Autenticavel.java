package j3.a1.pkgs.modelo;
/*
 * INTERFACES n�o t�m atributos, somente m�todos.
 * M�todos n�o s�o implementados nas interfaces.
 */
public interface Autenticavel {
	
	//as classes que assinarem o contrato da interface 
	//devem implementar seus m�todos.
	boolean autentica (int senha);
	
}
