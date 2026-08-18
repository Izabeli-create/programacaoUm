package fundamentosIfElse;
import java.util.Scanner;
public class L1Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a idade: ");
		int idade = sc.nextInt();
		
		if (idade >= 18) {
			System.out.println("Maior de idade.");
		}
		
		sc.close();
	}

}
