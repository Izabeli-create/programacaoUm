package fundamentosArrays;
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			numeros[i] = entrada.nextInt();
		}
		
		int maior = numeros[0];
		int menor = numeros[0];
		
		int posicaoMaior = 0;
		int posicaoMenor = 0;
		
		for (int i = 0; i < numeros.length; i++) {
		
			if (numeros[i] > maior) {
				maior = numeros[i];
				posicaoMaior = i;
			}
			
			if (numeros[i] < menor) {
				menor = numeros[i];
				posicaoMenor = i;
			}
		}
		
		System.out.println("Valores:");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println("\nMaior valor: " + maior);
		System.out.println("Posição do maior: " + posicaoMaior);
		
		System.out.println("Menor valor: " + menor);
		System.out.println("Posição do menor: " + posicaoMenor);
		
		entrada.close();
	}
}

