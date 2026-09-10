package fundamentosScanner;
import java.util.Scanner;
public class L1Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = entrada.nextLine();
		
		System.out.print("Digite a nota: ");
		int nota = entrada.nextInt();
		
		System.out.print("Digite a frequência: ");
		int frequencia = entrada.nextInt();
		
		String resultado = (nota >= 6 && frequencia >= 75)
			? "Aprovado"
			: "Reprovado";
		
		System.out.println("Aluno: " + nomeAluno);
		System.out.println("Resultado: " + resultado);
		
		entrada.close();

	}

}
