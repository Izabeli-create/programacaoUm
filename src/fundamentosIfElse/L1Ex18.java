package fundamentosIfElse;
import java.util.Scanner;
public class L1Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a média: ");
		double media = sc.nextDouble();
		
		System.out.print("Digite a frequência (%): ");
		double frequencia = sc.nextDouble();
		
		if (media >= 7.0 && frequencia >= 75.0) {
		
			System.out.println("Aluno aprovado!");
		
		if (media >= 9.5) {
			System.out.println("Aluno aprovado com mérito.");
		}
		
		} else {
			System.out.println("Aluno reprovado.");
		}
		
		sc.close();

	}

}
