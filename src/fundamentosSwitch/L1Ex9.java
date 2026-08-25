package fundamentosSwitch;
import java.util.Scanner;
public class L1Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1 - Informática");
		System.out.println("2 - Telefonia");
		
		System.out.print("Digite a categoria: ");
		int categoria = sc.nextInt();
		
		System.out.print("Digite o produto: ");
		int produto = sc.nextInt();

		
		switch (categoria) {
			case 1:
				switch (produto) {
					case 1:
						System.out.println("Notebook");
						break;
					case 2:
						System.out.println("Mouse");
						break;
					case 3:
						System.out.println("Teclado");
						break;
					default:
						System.out.println("Produto inválido.");
				}
			break;
			
			case 2:
				switch (produto) {
					case 1:
						System.out.println("Smartphone");
						break;
					case 2:
						System.out.println("Carregador");
						break;
					case 3:
						System.out.println("Fone de ouvido");
						break;
					default:
						System.out.println("Produto inválido.");
				}
			break;
			
			default:
				System.out.println("Categoria inválida.");
		}
		
		sc.close();

	}

}
