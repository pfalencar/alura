package j3.a1.pkgs.excecao;

//crio essa classe para herdar de RuntimeException
//estou criando a minha própria Exception.

public class SaldoInsuficienteException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final double saldoAtual;

	public SaldoInsuficienteException(double saldoAtual) {
		super("Saldo insuficienteeeee: " + saldoAtual); //retorno do e.getMessage()
		this.saldoAtual = saldoAtual;
	}
	
	public double getSaldoAtual() {
		return saldoAtual;
	}
	

}
