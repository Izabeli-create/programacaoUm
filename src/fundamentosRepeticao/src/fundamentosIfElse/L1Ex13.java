package fundamentosIfElse;
import java.util.Scanner;
public class L1Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a nota: ");
		double nota = sc.nextDouble();
		
		if (nota >= 90) {
			System.out.println("Excelente");
		} else if (nota >= 70) {
			System.out.println("Bom");
		} else if (nota >= 50) {
			System.out.println("Regular");
		} else {
			System.out.println("Insuficiente");
		}
		
		sc.close();

	}

}
