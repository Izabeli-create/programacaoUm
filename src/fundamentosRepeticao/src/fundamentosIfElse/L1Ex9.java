package fundamentosIfElse;
import java.util.Scanner;
public class L1Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Primeiro número: ");
		int n1 = sc.nextInt();
		
		System.out.print("Segundo número: ");
		int n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.println("O primeiro número é maior.");
		} else {
			System.out.println("O segundo número é maior ou igual.");
		}
		
		sc.close();

	}

}
