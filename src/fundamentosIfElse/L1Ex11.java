package fundamentosIfElse;
import java.util.Scanner;
public class L1Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a média: ");
		double media = sc.nextDouble();
		
		if (media >= 9.0) {
			System.out.println("Conceito A");
		} else if (media >= 7.0) {
			System.out.println("Conceito B");
		} else if (media >= 5.0) {
			System.out.println("Conceito C");
		} else {
			System.out.println("Conceito D");
		}
		
		sc.close();

	}

}
