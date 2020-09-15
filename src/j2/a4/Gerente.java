package j2.a4;
/*
 * A classe Funcionario sendo abstrata, ela n�o pode ser instanciada
 * e se ela t�m m�todos abstratos, suas filhas t�m que implement�-los.
 */
public class Gerente extends Funcionario{

	@Override
	public double getBonus() {
		return this.salario * 0.3;
	}
	
	public void cobraFuncionario() {
		System.out.println("Est� pronto?");
	}


}
