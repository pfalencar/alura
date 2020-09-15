package j1.a7;

public class Conta {
	int numero;
	Cliente titular;
	private double saldo;
	private double limite;
	//static - atributo compartilhado para todas as instâncias da classe (todos os objetos).
	private static int numeroIncremental = 1; 
	
	//o método estático só enxerga coisas estáticas.
	//static é um método da classe, não é de cada instância.
	public static int x() {
		return 2*numeroIncremental;
		//return 2*this.saldo //saldo de quem? Do joao ou do jose? 
	}
	public Conta(int numero, double limite) {
		this(numero, limite, 0);
	}	
	public Conta(int numero, double limite, double saldoInicial) {
		this.numero = numero;
		this.limite = limite; 
		this.saldo = saldoInicial;
	} 
	//O construtor enxerga coisas estáticas
	public Conta() {
		this.numero = numeroIncremental;
		numeroIncremental++;
	}
	
	
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
