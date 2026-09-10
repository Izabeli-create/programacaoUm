package fundamentosJava;

public class L2Ex13 {

	public static void main(String[] args) {
		boolean possuiCNH = true;
		boolean possuiCarro = false;
		boolean possuiDinheiro = true;
		
		// false: não possui carro.
		System.out.println(possuiCNH && possuiCarro);
		
		// true: possui dinheiro.
		System.out.println(possuiCarro || possuiDinheiro);
		
		// false: possui CNH, então !true = false.
		System.out.println(!possuiCNH);
		
		// true: possui CNH e dinheiro.
		System.out.println(possuiCNH && possuiDinheiro);
		
		// false: carro ou dinheiro é verdadeiro, então a negação é falsa.
		System.out.println(!(possuiCarro || possuiDinheiro));

	}

}
