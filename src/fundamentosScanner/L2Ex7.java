package fundamentosScanner;
import java.util.Scanner;
public class L2Ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite uma nota decimal: ");
		double nota = entrada.nextDouble();
		
		int notaInteira = (int) nota;
		
		double notaConvertida = (double) notaInteira;
		
		System.out.println("Valor inicial: " + nota);
		System.out.println("Valor convertido para int: " + notaInteira);
		System.out.println("Valor convertido novamente para double: " + notaConvertida);
		
		entrada.close();

	}

}
