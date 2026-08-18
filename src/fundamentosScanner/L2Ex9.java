package fundamentosScanner;
import java.util.Scanner;
public class L2Ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor de x: ");
		int x = entrada.nextInt();
		
		System.out.print("Digite o valor de y: ");
		int y = entrada.nextInt();
		
		int divisaoInteira = x / y;
		double divisaoReal = (double) x / y;
		
		System.out.println("Divisão inteira: " + divisaoInteira);
		System.out.println("Divisão em ponto flutuante: " + divisaoReal);
		
		entrada.close();
	}

}
