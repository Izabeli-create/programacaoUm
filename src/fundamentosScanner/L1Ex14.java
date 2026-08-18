package fundamentosScanner;
import java.util.Scanner;
public class L1Ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o salário: ");
		double salario = entrada.nextDouble();
		
		System.out.print("Digite o tempo de empresa em anos: ");
		int tempoEmpresa = entrada.nextInt();
		
		double bonus = (tempoEmpresa >= 5) ? 500.00 : 0.00;
		
		double salarioFinal = salario + bonus;
		
		System.out.println("\nNome: " + nome);
		System.out.println("Salário: R$ " + salario);
		System.out.println("Bônus: R$ " + bonus);
		System.out.println("Salário Final: R$ " + salarioFinal);
		
		entrada.close();

	}

}
