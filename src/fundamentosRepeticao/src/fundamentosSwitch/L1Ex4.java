package fundamentosSwitch;
import java.util.Scanner;
public class L1Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o código: ");
		int codigo = sc.nextInt();
		
		switch (codigo) {
			case 1:
				System.out.println("Cachorro-quente");
				break;
				
			case 2:
				System.out.println("Hambúrguer");
				break;
				
			case 3:
				System.out.println("Pizza");
				break;
				
			case 4:
				System.out.println("Refrigerante");
				break;
				
			case 5:
				System.out.println("Suco");
				break;
				
			default:
				System.out.println("Produto inválido.");
		}
		
		sc.close();

	}

}
