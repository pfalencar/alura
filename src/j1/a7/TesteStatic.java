package j1.a7;

public class TesteStatic {
	//o m�todo main � static pq � um m�todo da classe.
	//qdo a JVM chama o programa ela faz: TesteStatic.main()
	public static void main(String[] args) {
		Conta joao = new Conta();
		System.out.println(joao.getNumero());
		
		Conta jose = new Conta();
		System.out.println(jose.getNumero());
		
		System.out.println(Conta.x());
	}

}
