package fundamentosScanner;
import java.util.Scanner;
public class L1Ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor do arroz: ");
		double arroz = entrada.nextDouble();
		
		System.out.print("Digite o valor do feijão: ");
		double feijao = entrada.nextDouble();
		
		System.out.print("Digite o valor do óleo: ");
		double oleo = entrada.nextDouble();
		
		double total = arroz + feijao + oleo;
		double media = total / 3;
		
		System.out.println("Valor total da compra: R$ " + total);
		System.out.println("Valor médio dos produtos: R$ " + media);
		
		entrada.close();
	}

}
