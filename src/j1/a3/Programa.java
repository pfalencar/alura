package j1.a3;

public class Programa {

	public static void main(String[] args) {
		Conta patricia = new Conta();		
		patricia.numero = 123;
		patricia.saldo = 800.0;
		patricia.agencia = 842;
		
		patricia.titular = new Pessoa();
		patricia.titular.nome = "Patricia Alencar";
		patricia.titular.cpf = "254.457.684-45";
		patricia.titular.dataNascimento = "18/08/1984";
		System.out.println(patricia.titular.nome);
		
		patricia.depositar(100);
		patricia.sacar(5000.0);
		patricia.verificarSaldo();
		
		
		Conta gustavo = new Conta();
		gustavo.numero = 456;
		gustavo.saldo = 1500.0;
		
		gustavo.titular = new Pessoa();
		gustavo.titular.nome = "Gustavo Borges";
		gustavo.titular.cpf = "584.457.987-78";
		gustavo.titular.dataNascimento = "20/06/2013";
		System.out.println(gustavo.titular.nome);
		
		gustavo.depositar(100);
		gustavo.sacar(500);
		gustavo.verificarSaldo();		
		patricia.transferir(200.0, gustavo);
		
		
		System.out.println("Saldo " + patricia.titular.nome + ": " + patricia.saldo);
		System.out.println("Saldo " + gustavo.titular.nome + ": " +  gustavo.saldo);
		
	}

}
