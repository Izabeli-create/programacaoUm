package fundamentosScanner;
import java.util.Scanner;
public class L2Ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double celsius = entrada.nextDouble();
		
		double fahrenheit = (celsius * 9 / 5) + 32;
		
		System.out.println("Temperatura em Fahrenheit: " + fahrenheit + "°F");
		
		entrada.close();

	}

}
