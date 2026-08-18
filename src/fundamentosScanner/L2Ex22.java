package fundamentosScanner;
import java.util.Scanner;
public class L2Ex22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome do produto: ");
		String produto = entrada.nextLine();
		
		System.out.print("Digite o valor unitário: ");
		double valorUnitario = entrada.nextDouble();
		
		System.out.print("Digite a quantidade de produtos: ");
		int quantidade = entrada.nextInt();
		
		System.out.print("Digite a quantidade de parcelas: ");
		int parcelas = entrada.nextInt();
		
		double valorTotal = valorUnitario * quantidade;
		double valorParcela = valorTotal / parcelas;
		
		System.out.println("\nProduto: " + produto);
		System.out.println("Valor unitário: R$ " + valorUnitario);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Valor total: R$ " + valorTotal);
		System.out.println("Quantidade de parcelas: " + parcelas);
		System.out.println("Valor de cada parcela: R$ " + valorParcela);
		
		entrada.close();

	}

}
