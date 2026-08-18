package fundamentosIfElse;
import java.util.Scanner;
public class L1Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o peso: ");
		double peso = sc.nextDouble();
		
		System.out.print("Digite a altura: ");
		double altura = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("Seu IMC é: " + imc);
		
		if (imc < 18.5) {
			System.out.println("Magreza / Abaixo do peso");
		} else if (imc < 25.0) {
			System.out.println("Peso normal / Saudável");
		} else if (imc < 30.0) {
			System.out.println("Sobrepeso (Pré-obesidade)");
		} else if (imc < 35.0) {
			System.out.println("Obesidade Grau I");
		} else if (imc < 40.0) {
			System.out.println("Obesidade Grau II");
		} else {
			System.out.println("Obesidade Grau III (Grave)");
		}
		
		sc.close();

	}

}
