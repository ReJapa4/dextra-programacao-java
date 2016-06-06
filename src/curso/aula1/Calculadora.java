package curso.aula1;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite uma operacao: ");
		char operacao = leitor.nextLine().charAt(0);
		System.out.println("Digite um número inteiro: ");
		int valor1 = leitor.nextInt();
		System.out.println("Digite um número inteiro: ");
		int valor2 = leitor.nextInt();

		if (operacao == '+') {
			System.out.println(valor1 + " + " + valor2 + " = " + (valor1 + valor2));
		} else if (operacao == '-') {
			System.out.println(valor1 + " - " + valor2 + " = " + (valor1 - valor2));
		} else if (operacao == '*') {
			System.out.println(valor1 + " * " + valor2 + " = " + (valor1 * valor2));
		} else if (operacao == '/') {
			System.out.println(valor1 + " / " + valor2 + " = " + (valor1 / valor2));
		}

		leitor.close();

	}

}
