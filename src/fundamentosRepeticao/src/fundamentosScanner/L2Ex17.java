package fundamentosScanner;
import java.util.Scanner;
public class L2Ex17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a quantidade em estoque: ");
		int estoque = entrada.nextInt();
		
		String situacao = estoque < 5 ? "Estoque baixo" : "Estoque suficiente";
		
		System.out.println(situacao);
		
		entrada.close();

	}

}
