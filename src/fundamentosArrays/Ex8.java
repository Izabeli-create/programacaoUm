package fundamentosArrays;
import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int[][] estoque = new int[3][4];
		
		int maiorEstoque = 0;
		int produtoMaior = 0;
		int estoqueTotal = 0;
		
		for (int i = 0; i < estoque.length; i++) {
		
			System.out.println("Produto " + (i + 1));
			
			int totalProduto = 0;
			
			for (int j = 0; j < estoque[i].length; j++) {
			
				System.out.print("Digite o estoque do período "+ (j + 1) + ": ");
				
				estoque[i][j] = entrada.nextInt();
				
				totalProduto = totalProduto + estoque[i][j];
			}
			
			System.out.println("Estoque total do produto: "+ totalProduto);
			
			estoqueTotal = estoqueTotal + totalProduto;
			
			if (totalProduto > maiorEstoque) {
				maiorEstoque = totalProduto;
				produtoMaior = i;
			}
		}
		
		System.out.println("\nEstoque total: " + estoqueTotal);
		System.out.println("Maior estoque acumulado: Produto "+ (produtoMaior + 1));
		
		entrada.close();
	}
}

