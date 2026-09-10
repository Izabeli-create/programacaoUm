package fundamentosScanner;
import java.util.Scanner;
public class L2Ex21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o salário base: ");
		double salarioBase = entrada.nextDouble();
		
		System.out.print("Digite a quantidade de horas extras: ");
		int horasExtras = entrada.nextInt();
		
		double valorHoraExtra = 35.00;
		
		double valorHorasExtras = horasExtras * 35;
		double salarioFinal = salarioBase + valorHorasExtras;
		
		System.out.println("\nNome: " + nome);
		System.out.println("Salário base: R$ " + salarioBase);
		System.out.println("Valor das horas extras: R$ " + valorHorasExtras);
		System.out.println("Salário final: R$ " + salarioFinal);
		
		entrada.close();

	}

}
