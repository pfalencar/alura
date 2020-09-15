package j3.a1.pkgs.modelo;

public class Diretor extends Funcionario implements Autenticavel {

	@Override
	public double getBonus() {
		return this.salario * 0.35;
	}
	
	public void cobraRelatorios() {
		System.out.println("Preciso dos relat�rios.");
	}

	@Override
	public boolean autentica(int senha) {
		// implementamos a regra aqui
		return false;
	}
	
}