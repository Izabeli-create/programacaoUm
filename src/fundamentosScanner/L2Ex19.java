package fundamentosScanner;
import java.util.Scanner;
public class L2Ex19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o saldo: ");
		double saldo = entrada.nextDouble();
		
		String situacao = saldo > 0 
			? "Saldo positivo" 
			: "Saldo negativo";
		
		System.out.println("Saldo: R$ " + saldo);
		System.out.println("Situação: " + situacao);
		
		entrada.close();

	}

}
