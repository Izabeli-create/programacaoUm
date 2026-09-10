package fundamentosRepeticao;
import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		int soma = 0;
		
		System.out.print("Digite um número: ");
		numero = entrada.nextInt();
		
		while (numero >= 0) {
			soma = soma + numero;
			
			System.out.print("Digite um número: ");
			numero = entrada.nextInt();
		}
		
		System.out.println("Soma = " + soma);

	}

}
