package j1.a3;

public class Conta {
	int numero;
	Pessoa titular;	
	
	double saldo;
	int agencia;
	
	public void depositar(double valorASerDepositado) {
		this.saldo += valorASerDepositado - 0.1;
	}
	
	public void sacar(double valorASerSacado) {
		if (this.saldo >= valorASerSacado) {
			this.saldo -= valorASerSacado;
			System.out.println(this.titular.nome + "=>Aguarde a contagem das notas...");
		} else {
			System.out.println(this.titular.nome + "=>Não há saldo para este valor de saque.");
		}		
	}
	
	public void verificarSaldo() {
		System.out.println("Saldo atual: " + this.saldo);
	}
	
	public void transferir(double valor, Conta destino) {
		this.saldo -= valor;
		destino.saldo +=valor;
		System.out.println("Transferência de " + valor + " realizada com sucesso!");
	}
}
