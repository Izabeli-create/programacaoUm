package fundamentosJava;

public class L2Ex21 {

	public static void main(String[] args) {
		String nome = "João Gomes";
        double salarioBase = 2500.00;
        double valorHoraExtra = 35.00;
        int horasExtras = 8;

        double valorHorasExtras = horasExtras * 35;
        double salarioFinal = salarioBase + valorHorasExtras;

        System.out.println("Nome: " + nome);
        System.out.println("Salário base: R$ " + salarioBase);
        System.out.println("Valor das horas extras: R$ " + valorHorasExtras);
        System.out.println("Salário final: R$ " + salarioFinal);

	}

}
