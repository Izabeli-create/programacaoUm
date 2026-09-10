package fundamentosScanner;
import java.util.Scanner;
public class L2Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a quantidade de alunos: ");
		int totalAlunos = entrada.nextInt();
		
		System.out.print("Digite a quantidade de grupos: ");
		int grupos = entrada.nextInt();
		
		int divisaoInteira = totalAlunos / grupos;
		double divisaoReal = (double) totalAlunos / grupos;
		
		System.out.println("Divisão inteira: " + divisaoInteira);
		System.out.println("Divisão em ponto flutuante: " + divisaoReal);
		
		entrada.close();

	}

}
