package j3.a1.pkgs.modelo;

public class DBA extends Funcionario {

	@Override
	public double getBonus() {
		return this.salario * 0.1;
	}
	
}
