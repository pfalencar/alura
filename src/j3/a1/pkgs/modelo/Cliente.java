package j3.a1.pkgs.modelo;

public class Cliente implements Autenticavel {

	private String nome;
	private String endereco; 
	
	public boolean autentica(int senha) {
		// implementamos a regra de autenticacao
		return false;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
