package j3.a1.pkgs.programa;

import j3.a1.pkgs.excecao.SaldoInsuficienteException;
import j3.a1.pkgs.modelo.Conta;

/*
 * 								Exception  
 *    
 * IOException				  RuntimeException						  SQLException  
 * 		
 *       	    NullPointerException     ArrayIndexOutOfBoundsException
 * 
 * 
 * 
 * Exception => filhas: IOException, RuntimeException, SQLException
 * RuntimeException=>filhas: NullPointerException, ArrayIndexOutOfBoundsException
 * 
 * Alguns tipo de Exception � OBRIGAT�RIO TRATAR explicitamente:
 * OBRIGAT�RIO: IOException e SQLException. 
 * OPCIONAL: RuntimeException e suas filhas.
 */
public class TestaConta {
	
	public static void main(String[] args) {
		
		Conta joao = new Conta();
		joao.deposita(50.0);
		/*
		 * Sempre que vc quiser tratar o caso excepcional: TRY CATCH
		 * Indicar que isso pode acontecer, mas vc n�o quer tratar: THROWS
		 */
		try {
			joao.saca(100.0);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saldo est� insuficiente: " + e.getMessage());
		
		} catch (Exception e) {
			System.out.println("um outro erro qualquer!");
		}		
		
		System.out.println("Saldo Jo�o: " + joao.getSaldo());
	}
}
