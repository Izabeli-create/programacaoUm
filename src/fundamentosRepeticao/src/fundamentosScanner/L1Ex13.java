package fundamentosScanner;
import java.util.Scanner;
public class L1Ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a temperatura: ");
		double temperatura = entrada.nextDouble();
		
		String situacao = (temperatura > 25)
			? "Dia quente"
			: "Dia agradável";
		
		System.out.println("Temperatura: " + temperatura + "°C");
		System.out.println("Situação: " + situacao);
		
		entrada.close();

	}

}
