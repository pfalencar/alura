package j3.a1.pkgs.modelo;

/*
 * A classe Funcionario sendo abstrata, ela n�o pode ser instanciada
 * e se ela t�m m�todos abstratos, suas filhas t�m que implement�-los.
 */
public class Gerente extends Funcionario implements Autenticavel{

	@Override
	public double getBonus() {
		return this.salario * 0.3;
	}
	
	public void cobraFuncionario() {
		System.out.println("Est� pronto?");
	}

	@Override
	public boolean autentica(int senha) {
		// implementamos a regra aqui
		return false;
	}


}
