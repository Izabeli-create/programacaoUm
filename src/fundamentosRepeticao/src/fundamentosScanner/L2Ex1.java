package fundamentosScanner;
import java.util.Scanner;
public class L2Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite a idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine();
		
		System.out.print("Digite o curso: ");
		String curso = entrada.nextLine();
		
		System.out.print("Digite a altura: ");
		double altura = entrada.nextDouble();
		
		System.out.print("Digite a média final: ");
		double mediaFinal = entrada.nextDouble();
		
		System.out.print("Está matriculado? (true/false): ");
		boolean matriculado = entrada.nextBoolean();
		
		System.out.println("\nNome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Curso: " + curso);
		System.out.println("Altura: " + altura);
		System.out.println("Média final: " + mediaFinal);
		System.out.println("Está matriculado: " + matriculado);
		
		entrada.close();

	}

}
