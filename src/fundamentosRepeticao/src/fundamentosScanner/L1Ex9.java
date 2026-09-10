package fundamentosScanner;
import java.util.Scanner;
public class L1Ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Possui ingresso? (true/false): ");
		boolean possuiIngresso = entrada.nextBoolean();
		
		System.out.print("Possui documento? (true/false): ");
		boolean possuiDocumento = entrada.nextBoolean();
		
		System.out.print("Acompanhante é maior de idade? (true/false): ");
		boolean acompanhanteMaiorIdade = entrada.nextBoolean();
		
		System.out.println("\nResultados:");
		
		System.out.println("Ingresso E documento: "+ (possuiIngresso && possuiDocumento));
		// && significa E. Os dois valores precisam ser verdadeiros.
		
		System.out.println("Ingresso OU documento: "+ (possuiIngresso || possuiDocumento));
		// || significa OU. Basta um dos valores ser verdadeiro.
		
		System.out.println("Não possui documento: "+ (!possuiDocumento));
		// ! significa NÃO. Ele inverte o valor.
		
		System.out.println("Ingresso E (documento OU acompanhante maior): "+ (possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade)));
		// Primeiro resolve o OU dentro dos parênteses e depois o E.
		
		System.out.println("Não (ingresso E documento): "+ (!(possuiIngresso && possuiDocumento)));
		 // O ! inverte o resultado da expressão.
		
		entrada.close();

	}

}
