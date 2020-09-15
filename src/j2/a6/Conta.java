package j2.a6;

public class Conta {
	
	private double saldo;
	private String titular;
	private int numero;
	
	/*
	 * N�o � normal chamar esse m�todo para sacar um valor que n�o tem na conta
	 * Isso � uma exce��o. Estou fugindo da regra e jogando uma exce��o. 
	 * Por isso, LAN�O UMA NOVA EXCE��O (throw new RuntimeException)
	 * Qdo entra na exce��o, o programa PARA de rodar.
	 */
	
	/*
	 * Sempre que vc quiser tratar o caso excepcional: TRY CATCH
	 * Indicar que isso pode acontecer, mas vc n�o quer tratar: THROWS
	 */
	public void saca (double valor) throws SaldoInsuficienteException {
		if (saldo >= valor) {
			this.saldo -= valor;
		} else {
			throw new RuntimeException();
//			throw new SaldoInsuficienteException(saldo);
//			THROW s� lan�a, da� ele volta pro m�todo que chamou esse e
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
