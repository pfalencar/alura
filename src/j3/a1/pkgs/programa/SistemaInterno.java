package j3.a1.pkgs.programa;
/*
 * É como se todos que assinam o contrato Autenticável, ou seja, que implements Autenticável são um Autenticável?
 * Pq neste método posso receber qlqr Autenticável aqui, por ex.: um Cliente, Gerente ou Diretor.
 * Já que são estas as classes que assinaram o contrato Autenticavel
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
