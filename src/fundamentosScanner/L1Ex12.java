package fundamentosScanner;
import java.util.Scanner;
public class L1Ex12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		String resultado = (idade >= 18)
			? "Maior de idade"
			: "Menor de idade";
		
		System.out.println(resultado);
		
		entrada.close();

	}

}
