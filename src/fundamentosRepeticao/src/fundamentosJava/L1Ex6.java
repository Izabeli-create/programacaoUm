package fundamentosJava;

public class L1Ex6 {

	public static void main(String[] args) {
		double valorEmDolares = 75;
		double cotacaoDolar = 5.62;

		double valorEmReais = valorEmDolares * cotacaoDolar;

		System.out.printf("O monitor custa %.2f reais%n", valorEmReais);
	}

}
