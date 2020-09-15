package j2.a4;
/*
 * A classe Funcionario sendo abstrata, ela não pode ser instanciada
 * e se ela têm métodos abstratos, suas filhas têm que implementá-los.
 */
public class Gerente extends Funcionario{

	@Override
	public double getBonus() {
		return this.salario * 0.3;
	}
	
	public void cobraFuncionario() {
		System.out.println("Está pronto?");
	}


}
