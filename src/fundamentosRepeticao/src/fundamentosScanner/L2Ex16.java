package fundamentosScanner;
import java.util.Scanner;
public class L2Ex16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome do funcionário: ");
		String funcionario = entrada.nextLine();
		
		System.out.print("Digite o cargo: ");
		String cargo = entrada.nextLine();
		
		System.out.print("Digite o salário: ");
		String salario = entrada.nextLine();
		
		System.out.println("*************************");
		System.out.println("Funcionário: " + funcionario);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: R$" + salario);
		System.out.println("*************************");
		
		entrada.close();

	}

}
