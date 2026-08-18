package fundamentosScanner;
import java.util.Scanner;
public class L1Ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor em dólares: ");
		double valorEmDolares = entrada.nextDouble();
		
		double cotacaoDolar = 5.62;
		
		double valorEmReais = valorEmDolares * cotacaoDolar;
		
		System.out.printf("O monitor custa %.2f reais%n", valorEmReais);
		
		entrada.close();

	}

}
