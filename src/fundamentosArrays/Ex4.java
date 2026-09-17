package fundamentosArrays;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int[] numeros = new int[15];
		
		int pares = 0;
		int impares = 0;
		int maiores10 = 0;
		int menoresIguais10 = 0;
		
		for (int i = 0; i < numeros.length; i++) {
		
			System.out.print("Digite o número " + (i + 1) + ": ");
			numeros[i] = entrada.nextInt();
			
			if (numeros[i] % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			
			if (numeros[i] > 10) {
				maiores10++;
			} else {
				menoresIguais10++;
			}
		}
		
		System.out.println("Quantidade de pares: " + pares);
		System.out.println("Quantidade de ímpares: " + impares);
		System.out.println("Maiores que 10: " + maiores10);
		System.out.println("Menores ou iguais a 10: " + menoresIguais10);
		
		entrada.close();
	}
}

