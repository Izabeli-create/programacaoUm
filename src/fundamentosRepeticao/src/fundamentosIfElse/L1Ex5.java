package fundamentosIfElse;
import java.util.Scanner;
public class L1Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a idade: ");
		int idade = sc.nextInt();
		
		if (idade >= 60) {
			System.out.println("Cliente possui direito ao desconto.");
		}
		
		sc.close();

	}

}
