package j3.a3.jlang;

public class Conta {
	
	private double saldo;
	private int numero;
	private Cliente titular;
	
	

	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public String imprimirConta() {
		return "Número: " + this.numero + ", Titular: " + this.titular.toString()
				+ ", Saldo: " + this.saldo;
	}

	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Conta com saldo " + saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Conta)) return false; 
		else {
			Conta outra = (Conta) obj;
			return outra.saldo == this.saldo;
		} 
	}

}
