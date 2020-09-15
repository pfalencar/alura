package j3.a3.jlang;

public class GuardadorDeObjetos {

	private Object[] contas;
	private int posicaoLivre;
	
	public GuardadorDeObjetos() {
		 contas = new Object[100];
	}

	public void adiciona(Object nova) {		
		contas[posicaoLivre] = nova;
		posicaoLivre++;
	}
	
	public Object pega(int posicao) {
		return contas[posicao];
	}
	
//	public void imprimirVetorDeContas() {
//		for(Object c: contas) {
//			System.out.println(c.imprimirConta());			
//		}
//	}
	
	
}
