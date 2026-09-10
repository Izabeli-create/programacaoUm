package fundamentosRepeticao;
import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int senha;
		
		do {
			System.out.print("Digite a senha: ");
			senha = entrada.nextInt();
		} while (senha != 1234);
		
		System.out.println("Senha correta!");
		System.out.println("Acesso permitido.");

	}

}
