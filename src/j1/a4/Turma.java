package j1.a4;

public class Turma {
	Aluno[] alunos;
	
	public void imprimirAlunos() {
		for(Aluno a: alunos) {
			if (a == null) {
				continue; //ignora e continua nosso la�o
			}
			a.imprimirAluno();
		}
	}
	
}
