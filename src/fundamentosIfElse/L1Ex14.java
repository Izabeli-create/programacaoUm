package fundamentosIfElse;
import java.util.Scanner;
public class L1Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a idade do atleta: ");
		int idade = sc.nextInt();
		
		if (idade <= 12) {
			System.out.println("Infantil");
		} else if (idade <= 17) {
			System.out.println("Juvenil");
		} else if (idade <= 39) {
			System.out.println("Adulto");
		} else {
			System.out.println("Master");
		}
		
		sc.close();

	}

}
