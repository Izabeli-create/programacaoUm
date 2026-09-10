package fundamentosRepeticao;

public class Ex3 {

	public static void main(String[] args) {
		int numero = 1;
		int soma = 0;
		
		while (numero <= 100) {
			soma = soma + numero++;
		}
		
		System.out.println("Soma = " + soma);

	}

}
