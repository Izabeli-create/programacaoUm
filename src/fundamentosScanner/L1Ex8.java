package fundamentosScanner;
import java.util.Scanner;
public class L1Ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int numA = entrada.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numB = entrada.nextInt();
		
		int divisaoInteira = numA / numB;
		
		double divisaoReal = (double) numA / numB;
		
		System.out.println("Divisão inteira: " + divisaoInteira);
		System.out.println("Divisão real: " + divisaoReal);
		
		entrada.close();

	}

}
