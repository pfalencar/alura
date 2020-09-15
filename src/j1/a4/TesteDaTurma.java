package j1.a4;

public class TesteDaTurma {
	public static void main(String[] args) {
		Turma fj11 = new Turma();
		fj11.alunos = new Aluno[10];
		
		fj11.alunos[0] = new Aluno();
		fj11.alunos[0].nome = "Patricia";
		fj11.alunos[0].nota = 8;
		
		fj11.alunos[1] = new Aluno();
		fj11.alunos[1].nome = "Joaquim";
		fj11.alunos[1].nota = 8;
		
		fj11.alunos[2] = new Aluno();
		fj11.alunos[2].nome = "Manuela";
		fj11.alunos[2].nota = 9;
		
		fj11.alunos[3] = new Aluno();
		fj11.alunos[3].nome = "Maria";
		fj11.alunos[3].nota = 7;
		
		fj11.imprimirAlunos();
		
	}

}
