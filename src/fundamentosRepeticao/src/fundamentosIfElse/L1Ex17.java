package fundamentosIfElse;
import java.util.Scanner;
public class L1Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o usuário: ");
		String usuario = sc.nextLine();
		
		System.out.print("Digite a senha: ");
		String senha = sc.nextLine();
		
		if (usuario.equals("admin")) {
		
		if (senha.equals("1234")) {
			System.out.println("Acesso permitido.");
		} else {
			System.out.println("Senha incorreta.");
		}
		
		} else {
		            System.out.println("Usuário inexistente.");
		}
		
		sc.close();

	}

}
