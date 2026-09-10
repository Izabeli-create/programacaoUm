package fundamentosRepeticao;
import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = entrada.nextInt();
		
		int soma = 0;
		
		for (int numero = 1; numero <= n; numero++) {
			soma = soma + numero;
		}
		
		System.out.println("Soma: " + soma);

	}

}
