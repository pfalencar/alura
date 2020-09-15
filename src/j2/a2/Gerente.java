package j2.a2;

public class Gerente extends Funcionario{

	@Override
	public double getBonus() {
		return this.salario * 0.3;
	}
	
	public void cobraFuncionario() {
		System.out.println("Está pronto?");
	}
}
