package fundamentosScanner;
import java.util.Scanner;
public class L2Ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Possui CNH? (true/false): ");
		boolean possuiCNH = entrada.nextBoolean();
		
		System.out.print("Possui carro? (true/false): ");
		boolean possuiCarro = entrada.nextBoolean();
		
		System.out.print("Possui dinheiro? (true/false): ");
		boolean possuiDinheiro = entrada.nextBoolean();
		
		System.out.println("CNH E carro: " + (possuiCNH && possuiCarro));
		System.out.println("Carro OU dinheiro: " + (possuiCarro || possuiDinheiro));
		System.out.println("Não possui CNH: " + (!possuiCNH));
		System.out.println("CNH E dinheiro: " + (possuiCNH && possuiDinheiro));
		System.out.println("Não (carro OU dinheiro): " + (!(possuiCarro || possuiDinheiro)));
		
		entrada.close();
	}

}
