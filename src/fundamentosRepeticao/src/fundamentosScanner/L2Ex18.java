package fundamentosScanner;
import java.util.Scanner;
public class L2Ex18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a média: ");
		double media = entrada.nextDouble();
		
		String resultado = media >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(resultado);
		
		entrada.close();

	}

}
