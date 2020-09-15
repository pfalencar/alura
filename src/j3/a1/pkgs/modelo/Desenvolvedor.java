package j3.a1.pkgs.modelo;

public class Desenvolvedor extends Funcionario{	
	@Override
	public double getBonus() {
		return this.salario * 0.25;
	}
	
}
