
public class Main
{
	public static void main(String[] args) {
		Aluno[] alunos = new Aluno[2];
		alunos[0] = new Aluno("Emanuel", 18, 22724);
		alunos[1] = new Aluno("Jorge", 26, 77563);
		
		for (Aluno a: alunos){
		    System.out.println(a.toString());
		}
		    
		Professor[] professor = new Professor[1];
		professor[0] = new Professor("Roberto", 40, "Desenvolvimento Web");
		
		for (Professor a: professor){
		    System.out.println(a.toString());
		}
	}
}
