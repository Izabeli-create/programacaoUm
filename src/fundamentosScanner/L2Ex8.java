package fundamentosScanner;
import java.util.Scanner;
public class L2Ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite uma temperatura decimal: ");
		double temperatura = entrada.nextDouble();
		
		int temperaturaInteira = (int) temperatura;
		
		double temperaturaConvertida = (double) temperaturaInteira;
		
		System.out.println("Temperatura inicial: " + temperatura);
		System.out.println("Temperatura como int: " + temperaturaInteira);
		System.out.println("Temperatura novamente como double: " + temperaturaConvertida);
		
		entrada.close();

	}

}
