package fundamentosScanner;
import java.util.Scanner;
public class L1Ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o salário: ");
		double salario = entrada.nextDouble();
		
		int salarioInteiro = (int) salario;
		
		double salarioDouble = (double) salarioInteiro;
		
		System.out.println("Salário original: " + salario);
		System.out.println("Salário inteiro: " + salarioInteiro);
		System.out.println("Salário convertido para double: " + salarioDouble);
		
		entrada.close();

	}

}
