package fundamentosRepeticao;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		
		int numero = entrada.nextInt();
		int contador = 1;
		while (contador <= 10) {
			System.out.println(numero + " x " + contador + " = " + (numero * contador++));
		}

	}

}
