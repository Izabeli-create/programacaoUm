package fundamentosIfElse;
import java.util.Scanner;
public class L1Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a temperatura: ");
		double temp = sc.nextDouble();
		
		if (temp >= 30) {
			System.out.println("Está calor.");
		} else {
			System.out.println("A temperatura está agradável.");
		}
		
		sc.close();

	}

}
