package fundamentosArrays;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		String[] alunos = new String[8];
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
			alunos[i] = entrada.nextLine();
		}
		
		System.out.print("Digite o nome que deseja pesquisar: ");
		String pesquisa = entrada.nextLine();
		
		boolean encontrado = false;
		
		for (int i = 0; i < alunos.length; i++) {
		
			if (alunos[i].equals(pesquisa)) {
				System.out.println("Aluno encontrado na posição: " + i);
				encontrado = true;
			}
		}
		
		if (encontrado == false) {
			System.out.println("Aluno não encontrado.");
		}
		
		entrada.close();
	}
}
