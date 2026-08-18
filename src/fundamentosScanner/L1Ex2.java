package fundamentosScanner;
import java.util.Scanner;
public class L1Ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome do produto: ");
		String nomeProduto = entrada.nextLine();
		
		System.out.print("Digite o código: ");
		int codigo = entrada.nextInt();
		
		System.out.print("Digite o preço: ");
		double preco = entrada.nextDouble();
		
		System.out.print("Digite a quantidade em estoque: ");
		int quantidadeEstoque = entrada.nextInt();
		
		System.out.println("\nProduto: " + nomeProduto);
		System.out.println("Código: " + codigo);
		System.out.println("Preço: R$ " + preco);
		System.out.println("Quantidade em estoque: " + quantidadeEstoque);
		
		entrada.close();
	}

}
