package fundamentosArrays;
import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int[][] matriz = new int[4][4];
		
		int soma = 0;
		int maior;
		int menor;
		
		for (int i = 0; i < matriz.length; i++) {
		
			for (int j = 0; j < matriz[i].length; j++) {
			
				System.out.print("Digite um número: ");
				matriz[i][j] = entrada.nextInt();
				
				soma = soma + matriz[i][j];
			}
		}
		
		maior = matriz[0][0];
		menor = matriz[0][0];
		
		for (int i = 0; i < matriz.length; i++) {
		
			for (int j = 0; j < matriz[i].length; j++) {
			
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
				
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
				}
			}
		}
		
		double media = (double) soma / (matriz.length * matriz[0].length);
		
		System.out.println("\nMatriz:");
		
		for (int i = 0; i < matriz.length; i++) {
		
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		System.out.println("Maior elemento: " + maior);
		System.out.println("Menor elemento: " + menor);
		
		entrada.close();
	}
}

