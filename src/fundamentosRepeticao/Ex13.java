package fundamentosRepeticao;
import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = entrada.nextInt();
		for (int contador = 1; contador <= 10; contador++) {
			System.out.println(numero + " x " + contador + " = " + (numero * contador));
		}

	}

}
