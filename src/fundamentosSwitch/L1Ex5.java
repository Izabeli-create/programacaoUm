package fundamentosSwitch;
import java.util.Scanner;
public class L1Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o conceito: ");
		char conceito = sc.next().charAt(0);
		
		switch (conceito) {
			case 'A':
				System.out.println("Excelente");
				break;
				
			case 'B':
				System.out.println("Bom");
				break;
				
			case 'C':
				System.out.println("Regular");
				break;
				
			case 'D':
				System.out.println("Insuficiente");
				break;
				
			case 'F':
				System.out.println("Reprovado");
				break;
				
			default:
				System.out.println("Conceito inválido.");
		}
		
		sc.close();

	}

}
