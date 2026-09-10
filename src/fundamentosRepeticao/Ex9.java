package fundamentosRepeticao;
import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int opcao;
		
		do {
			System.out.println("===== MENU =====");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Consultar");
			System.out.println("3 - Excluir");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = entrada.nextInt();
		} while (opcao != 0);
		
		System.out.println("Programa encerrado.");

	}

}
