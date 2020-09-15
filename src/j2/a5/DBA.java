package j2.a5;

public class DBA extends Funcionario {

	@Override
	public double getBonus() {
		return this.salario * 0.1;
	}
	
}
