package j1.a5;

public class Conta {
	int numero;
	Cliente titular;
	private double saldo;
	private double limite;
	
	
	//Encapsular: esconder o código da regra de negócio dentro da classe.
	//e proibir o acesso com o modificador private
	public void saca (double valorASerSacado) {
		double credito = this.saldo + this.limite;		
		if (valorASerSacado > credito) {
			System.out.println("Sem saldo para efetuar saque de R$ " 
		                     + valorASerSacado );
			System.out.println("Limite do João: " + this.limite);
		} else {
			double saldoAnteriorAoSaque = this.saldo;			
			this.saldo = this.saldo - valorASerSacado;
			if (this.saldo < 0) {
				double usouDoLimite = valorASerSacado - saldoAnteriorAoSaque; 
				System.out.println("Você sacou todo o saldo e usou R$ " 
			            + usouDoLimite
						+ " do seu limite de R$ " + this.limite);
				this.limite = this.limite - usouDoLimite;
				System.out.println("Limite atual: " + this.limite);
			} else {
				System.out.println("Saque realizado com sucesso!");
				//System.out.println("Saldo " + this.titular.nome + this.saldo);
			}
		}
		
	}
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public int getNumero() {
		return this.numero;
	}

	

	
}
