package j2.a5;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double getBonus();	
	
	public String getNome() {
		return nome;
	}

	
}
