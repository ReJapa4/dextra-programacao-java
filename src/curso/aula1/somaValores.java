package curso.aula1;

import java.util.Scanner;

public class somaValores {
	public static void main(String args[]) {
		// Scanner leitor: lê os dados do teclado.
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe um valor inteiro: ");
		// nextInt para ler um numero inteiro do teclado
		int num1 = leitor.nextInt();
		System.out.println(num1);

		System.out.println("Informe um valor inteiro: ");
		int num2 = leitor.nextInt();
		System.out.println(num1);
		int resultado = num1 + num2;

		System.out.println(num1 + " + " + num2 + " = " + resultado);

		String resultado1 = resultado > 100 ? "Maior que 100: " + resultado
				: "Menor que 100: " + resultado;

		System.out.println(resultado1);
	}

}
