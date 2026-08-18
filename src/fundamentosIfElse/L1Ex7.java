package fundamentosIfElse;
import java.util.Scanner;
public class L1Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a média: ");
		double media = sc.nextDouble();
		
		if (media >= 7.0) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno reprovado!");
		}

        sc.close();

	}

}
