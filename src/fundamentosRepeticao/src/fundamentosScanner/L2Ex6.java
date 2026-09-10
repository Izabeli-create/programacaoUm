package fundamentosScanner;
import java.util.Scanner;
public class L2Ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a distância em quilômetros: ");
		double quilometros = entrada.nextDouble();
		
		double metros = quilometros * 1000;
		
		System.out.println("Distância em metros: " + metros);
		
		entrada.close();

	}

}
