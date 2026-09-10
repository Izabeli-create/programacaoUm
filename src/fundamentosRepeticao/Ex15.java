package fundamentosRepeticao;
import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double soma = 0;
		
		for (int contador = 1; contador <= 5; contador++) {
			System.out.print("Digite a nota: ");
			double nota = entrada.nextDouble();
			
			soma = soma + nota;
		}
		
		System.out.println("Soma das notas = " + soma);
		System.out.println("Média das notas = " + (soma / 5));

	}

}
