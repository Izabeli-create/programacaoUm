package fundamentosScanner;
import java.util.Scanner;
public class L1Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = entrada.nextLine();
		
		System.out.print("Digite a nota 1: ");
		double nota1 = entrada.nextDouble();
		
		System.out.print("Digite a nota 2: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("\nAluno: " + nomeAluno);
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Média: " + media);
		
		entrada.close();

	}

}
