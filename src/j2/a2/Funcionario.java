package j2.a2;

public class Funcionario {
	protected String nome;
	protected double salario;
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonus() {
		return this.salario * 0.2;
	}
	
}
