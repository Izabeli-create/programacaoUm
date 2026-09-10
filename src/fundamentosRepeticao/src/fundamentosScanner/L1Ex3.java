package fundamentosScanner;
import java.util.Scanner;
public class L1Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int numA = entrada.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numB = entrada.nextInt();
		
		int soma = numA + numB;
		int subtracao = numA - numB;
		int multiplicacao = numA * numB;
		int divisao = numA / numB;
		int resto = numA % numB;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);
		System.out.println("Resto: " + resto);
		
		entrada.close();

	}

}
