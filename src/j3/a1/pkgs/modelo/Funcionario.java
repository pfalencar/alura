package j3.a1.pkgs.modelo;

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
