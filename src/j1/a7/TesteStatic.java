package j1.a7;

public class TesteStatic {
	//o método main é static pq é um método da classe.
	//qdo a JVM chama o programa ela faz: TesteStatic.main()
	public static void main(String[] args) {
		Conta joao = new Conta();
		System.out.println(joao.getNumero());
		
		Conta jose = new Conta();
		System.out.println(jose.getNumero());
		
		System.out.println(Conta.x());
	}

}
