package fundamentosJava;

public class L2Ex22 {

	public static void main(String[] args) {
		String produto = "Notebook";
		double valorUnitario = 1250.00;
		int quantidade = 2;
		int parcelas = 5;
		
		double valorTotal = valorUnitario * quantidade;
		double valorParcela = valorTotal / parcelas;
		
		System.out.println("Produto: " + produto);
		System.out.println("Valor unitário: R$ " + valorUnitario);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Valor total: R$ " + valorTotal);
		System.out.println("Quantidade de parcelas: " + parcelas);
		System.out.println("Valor de cada parcela: R$ " + valorParcela);

	}

}
