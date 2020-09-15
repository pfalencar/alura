package j3.a1.pkgs.programa;
/*
 * � como se todos que assinam o contrato Autentic�vel, ou seja, que implements Autentic�vel s�o um Autentic�vel?
 * Pq neste m�todo posso receber qlqr Autentic�vel aqui, por ex.: um Cliente, Gerente ou Diretor.
 * J� que s�o estas as classes que assinaram o contrato Autenticavel
 */

import j3.a1.pkgs.modelo.Autenticavel;

public class SistemaInterno {

	public void autentica (Autenticavel a) {
		
		int senha = 123; //depois pegaremos do teclado
		
		if (a.autentica(senha) == true) {
			System.out.println("Bem vindo ao sistema");
		} else {
			System.out.println("senha incorreta");
		}
	}
}
