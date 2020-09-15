package j3.a5.collections;

public class Conta implements Comparable<Conta> {

	private double saldo;
	private int numero;
	
	public Conta(double d) {
		this.saldo = d;
	}

	public double getSaldo() {
		return saldo;
	}
	public int getNumero() {
		return this.numero;
	}
		
	@Override
	public String toString() {
		return "Saldo: " + this.saldo;
	}

	@Override
	public int compareTo(Conta o) {
		if (this.saldo < o.getSaldo()) return -1;
		if (this.saldo > o.getSaldo()) return 1;
		return 0;
	}

	//transforma um objeto/String em um n�mero
	//fica mais f�cil e r�pido de procurar (HashSet) do que outras cole��es 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}
	
}
