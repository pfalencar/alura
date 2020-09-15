package j1.a5;

public class TesteModificador {
	public static void main(String[] args) {
		
		Conta joao = new Conta();		
		joao.numero = 123;		
		joao.setLimite(100.0);
		
		joao.deposita(500.0);
		joao.saca(550.0);
		
		System.out.println("Saldo do joão: " + joao.getSaldo());
		
		Cliente c = new Cliente();
		c.nome = "João da Silva";
		c.endereco = "Rua do Lavrador, 78";
		c.imprimir();
		joao.titular = c;
		joao.titular.idade = 56;
		System.out.println(joao.titular.idade);
		
		
		
	}

}
