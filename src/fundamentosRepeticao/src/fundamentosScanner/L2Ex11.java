package fundamentosScanner;
import java.util.Scanner;
public class L2Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a temperatura: ");
		int temperatura = entrada.nextInt();
		
		System.out.println(temperatura > 25);
		System.out.println(temperatura <= 30);
		System.out.println(temperatura == 20);
		System.out.println(temperatura != 30);
		
		entrada.close();

	}

}
