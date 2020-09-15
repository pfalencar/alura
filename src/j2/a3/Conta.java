package j2.a3;
//ctrl + shift + f  IDENTA O CÓDIGO
//Ctrl + o NAVEGO DENTRO DO MEU ARQUIVO, AJUDA A ACHAR UM MÉTODO
//CTRL + W ou CTRL + F4 fecha os arquivos
//CTRL + SHIFT + T => escrevo o nome da classe que quero abrir. 
//CTRL + 1 => para corrigir alguns erros
//CTRL + 3 => acessar qlqr coisa a qlqr instante
public class Conta {

	private double saldo;
	private String nome;
	private int agencia;
	// ggas atalho para gerar getters e setters

	public Conta(String nome, int agencia, double saldo) {
		this.nome = nome;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.agencia);
		System.out.println(this.saldo);
	}

}
