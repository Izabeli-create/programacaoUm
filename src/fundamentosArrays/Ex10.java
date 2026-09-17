package fundamentosArrays;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		double[][] notas = new double[5][4];
		
		double maiorMedia = 0;
		double menorMedia = 0;
		
		int alunoMaior = 0;
		int alunoMenor = 0;
		
		double somaGeral = 0;
		int aprovados = 0;
		
		for (int i = 0; i < notas.length; i++) {
		
			System.out.println("Aluno " + (i + 1));
			
			for (int j = 0; j < notas[i].length; j++) {
			
				System.out.print("Digite a nota da avaliação "+ (j + 1) + ": ");
				
				notas[i][j] = entrada.nextDouble();
			}
		}
		
		System.out.println("\nNotas:");
		
		for (int i = 0; i < notas.length; i++) {
		
			System.out.print("Aluno " + (i + 1) + ": ");
			
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			}
			
			System.out.println();
		}
		
		for (int i = 0; i < notas.length; i++) {
		
			double somaAluno = 0;
			
			for (int j = 0; j < notas[i].length; j++) {
				somaAluno = somaAluno + notas[i][j];
			}
			
			double mediaAluno = somaAluno / notas[i].length;
			
			System.out.println("Aluno " + (i + 1)+ " - Média: " + mediaAluno);
			
			somaGeral = somaGeral + somaAluno;
			
			if (i == 0) {
				maiorMedia = mediaAluno;
				menorMedia = mediaAluno;
			}
			
			if (mediaAluno > maiorMedia) {
				maiorMedia = mediaAluno;
				alunoMaior = i;
			}
			
			if (mediaAluno < menorMedia) {
				menorMedia = mediaAluno;
				alunoMenor = i;
			}
			
			if (mediaAluno >= 7.0) {
				aprovados++;
			}
		}
		
		double mediaTurma = somaGeral / (notas.length * notas[0].length);
		
		System.out.println("\nMaior média: Aluno "+ (alunoMaior + 1) + " - " + maiorMedia);
		
		System.out.println("Menor média: Aluno "+ (alunoMenor + 1) + " - " + menorMedia);
		
		System.out.println("Média da turma: " + mediaTurma);
		
		System.out.println("Alunos aprovados: " + aprovados);
		
		entrada.close();
	}
}

