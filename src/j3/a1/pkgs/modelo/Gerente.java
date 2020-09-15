package j3.a1.pkgs.modelo;

/*
 * A classe Funcionario sendo abstrata, ela não pode ser instanciada
 * e se ela têm métodos abstratos, suas filhas têm que implementá-los.
 */
public class Gerente extends Funcionario implements Autenticavel{

	@Override
	public double getBonus() {
		return this.salario * 0.3;
	}
	
	public void cobraFuncionario() {
		System.out.println("Está pronto?");
	}

	@Override
	public boolean autentica(int senha) {
		// implementamos a regra aqui
		return false;
	}


}
