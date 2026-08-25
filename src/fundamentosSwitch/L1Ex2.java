package fundamentosSwitch;
import java.util.Scanner;
public class L1Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int n1 = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int n2 = sc.nextInt();
		
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		
		System.out.print("Escolha: ");
		int opcao = sc.nextInt();
		
		switch (opcao) {
			case 1:
				System.out.println(n1 + n2);
				break;
			
			case 2:
				System.out.println(n1 - n2);
				break;
			
			case 3:
				System.out.println(n1 * n2);
				break;
			
			case 4:
				System.out.println(n1 / n2);
				break;
			
			default:
				System.out.println("Opção inválida.");
		}
		
		sc.close();

	}

}
