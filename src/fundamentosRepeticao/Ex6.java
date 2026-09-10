package fundamentosRepeticao;
import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o número de início: ");
		int inicio = entrada.nextInt();
		
		System.out.print("Digite o número de finalização: ");
		int fim = entrada.nextInt();
		
		do {
			System.out.println(inicio++);
		} while (inicio <= fim);

	}

}
