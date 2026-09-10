package fundamentosScanner;
import java.util.Scanner;
public class L1Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.print("Digite sua altura: ");
		double altura = entrada.nextDouble();
		
		System.out.print("Digite seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Digite seu sexo (M/F): ");
		char sexo = entrada.next().charAt(0);
		
		System.out.print("A matrícula está ativa? (true/false): ");
		boolean matriculaAtiva = entrada.nextBoolean();
		
		System.out.println("\nNome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("Sexo: " + sexo);
		System.out.println("Matrícula ativa: " + matriculaAtiva);
		        
		entrada.close();

	}

}
