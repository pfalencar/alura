package j2.a6;

public class Conta {
	
	private double saldo;
	private String titular;
	private int numero;
	
	/*
	 * Não é normal chamar esse método para sacar um valor que não tem na conta
	 * Isso é uma exceção. Estou fugindo da regra e jogando uma exceção. 
	 * Por isso, LANÇO UMA NOVA EXCEÇÃO (throw new RuntimeException)
	 * Qdo entra na exceção, o programa PARA de rodar.
	 */
	
	/*
	 * Sempre que vc quiser tratar o caso excepcional: TRY CATCH
	 * Indicar que isso pode acontecer, mas vc não quer tratar: THROWS
	 */
	public void saca (double valor) throws SaldoInsuficienteException {
		if (saldo >= valor) {
			this.saldo -= valor;
		} else {
			throw new RuntimeException();
//			throw new SaldoInsuficienteException(saldo);
//			THROW só lança, daí ele volta pro método que chamou esse e
//			entra no CATCH.
		}
	}
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public String getTitular() {
		return this.titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	
}
