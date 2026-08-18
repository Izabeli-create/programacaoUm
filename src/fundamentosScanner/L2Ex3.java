package fundamentosScanner;
import java.util.Scanner;
public class L2Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a distância percorrida: ");
		double distancia = entrada.nextDouble();
		
		System.out.print("Digite a quantidade de litros consumidos: ");
		double litros = entrada.nextDouble();
		
		double consumoMedio = distancia / litros;
		double litrosPara100Km = 100 / consumoMedio;
		
		System.out.println("Consumo médio: " + consumoMedio + " km/l");
		System.out.println("Litros para 100 km: " + litrosPara100Km);
		
		entrada.close();

	}

}
