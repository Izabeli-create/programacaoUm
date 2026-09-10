package fundamentosIfElse;
import java.util.Scanner;
public class L1Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a idade: ");
		int idade = sc.nextInt();
		
		if (idade <= 12) {
			System.out.println("Criança");
		} else if (idade <= 17) {
			System.out.println("Adolescente");
		} else if (idade <= 59) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idoso");
		}
		
		sc.close();

	}

}
