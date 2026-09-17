package fundamentosArrays;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] notas = new double[5];
		double soma = 0;
		double media;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
		notas[i] = entrada.nextDouble();
		
		soma = soma + notas[i];
		}
		
		System.out.println("Notas informadas:");
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		media = soma / notas.length;
		
		System.out.println("Média da turma: " + media);
		
		entrada.close();
		}
}
