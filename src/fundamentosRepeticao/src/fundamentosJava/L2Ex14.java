package fundamentosJava;

public class L2Ex14 {

	public static void main(String[] args) {
		boolean chovendo = true;
		boolean guardaChuva = false;
		boolean carroDisponivel = true;
		
		System.out.println(chovendo && guardaChuva);
		System.out.println(guardaChuva || carroDisponivel);
		System.out.println(!chovendo);
		System.out.println(chovendo && (guardaChuva || carroDisponivel));
		System.out.println(!(chovendo && guardaChuva));

	}

}
