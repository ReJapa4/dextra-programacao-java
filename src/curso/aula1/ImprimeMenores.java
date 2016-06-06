package curso.aula1;

import java.util.Scanner;

/**
 * Escreva um programa que receba um numero menor ou igual a 100 e imprima os
 * numeros menores que esse numero. O programa deve solicitar numero ao usuario
 * ate que ele digite 0.
 * 
 * @author java04
 *
 **/

public class ImprimeMenores {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite um número de 0 a 100: ");
		int numb = leitor.nextInt();
	
		while (numb != 0) {
			if (numb <= 100) {
				int cont = 0;
				while (cont < numb) {
					System.out.println(cont++);
				}
			} else
				System.out.println("Erro");
			System.out.println("Digite um número de 0 a 100: ");
			numb = leitor.nextInt();
		}

	}

}
