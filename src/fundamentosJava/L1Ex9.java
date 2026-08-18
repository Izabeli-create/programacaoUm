package fundamentosJava;

public class L1Ex9 {

	public static void main(String[] args) {
		boolean possuiIngresso = true;
		boolean possuiDocumento = false;
		boolean acompanhanteMaiorIdade = true;

		System.out.println("Ingresso E documento: "+ (possuiIngresso && possuiDocumento));
		// && significa E. Os dois valores precisam ser verdadeiros.
		System.out.println("Ingresso OU documento: "+ (possuiIngresso || possuiDocumento));
		// || significa OU. Basta um dos valores ser verdadeiro.
		System.out.println("Não possui documento: "+ (!possuiDocumento));
		// ! significa NÃO. Inverte o valor boolean.
		System.out.println("Ingresso E (documento OU acompanhante maior): "+ (possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade)));
		// Primeiro verifica o OU dentro dos parênteses e depois o E.
		System.out.println("Não (ingresso E documento): "+ (!(possuiIngresso && possuiDocumento)));
		// ! inverte o resultado da expressão.

	}

}
