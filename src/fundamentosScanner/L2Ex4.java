package fundamentosScanner;
import java.util.Scanner;
public class L2Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		double nota3 = entrada.nextDouble();
		
		double soma = nota1 + nota2 + nota3;
		double media = soma / 3;
		
		System.out.println("Soma das notas: " + soma);
		System.out.println("Média final: " + media);
		
		entrada.close();

	}

}
