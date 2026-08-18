package fundamentosIfElse;
import java.util.Scanner;
public class L1Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		
		if (numero % 5 == 0) {
			System.out.println("O número é múltiplo de 5.");
		}
		
		sc.close();

	}

}
