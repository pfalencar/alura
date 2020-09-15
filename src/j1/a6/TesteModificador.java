package j1.a6;

public class TesteModificador {
	public static void main(String[] args) {
		Conta joao = new Conta(123, 100.0, 500.0);		
		//joao.numero = 123;
		joao.setLimite(100.0);
		joao.deposita(500.0);
		joao.saca(550.0);
		System.out.println("Saldo do joão: " + joao.getSaldo());
	
	}

}
