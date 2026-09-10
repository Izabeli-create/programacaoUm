package fundamentosRepeticao;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String resposta;
		double soma = 0;
		int quantidade = 0;
		do {
			System.out.print("Digite o nome do aluno: ");
			String nome = entrada.next();
			
			System.out.print("Digite a nota: ");
			double nota = entrada.nextDouble();
			
			soma = soma + nota;
			
			quantidade++;
			
			System.out.print("Deseja cadastrar outro aluno? (S/N): ");
			resposta = entrada.next();
		} while (resposta.equalsIgnoreCase("S"));
		
		System.out.println("Média = " + (soma / quantidade));

	}

}
