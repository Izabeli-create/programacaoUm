package fundamentosRepeticao;
import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		int contador = 1;
		
		do {
			System.out.print("Digite um número: ");
			numero = entrada.nextInt();
			
			soma = soma + numero;
			
			contador++;
		} while (contador <= 5);
		
		System.out.println("Soma = " + soma);

	}

}
