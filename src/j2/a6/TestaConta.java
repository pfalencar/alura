package j2.a6;

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
