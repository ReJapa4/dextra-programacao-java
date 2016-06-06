package curso.aula1;

import java.util.Scanner;
/**
 * Desenhe a seguinte piramide de numeros. O usuario determina a quantidade de linhas:
 * 01
 * 02 02
 * 03 03 03
 * 04 04 04 04
 * 05 05 05 05 05
 * 06 06 06 06 06 06
 * 07 07 07 07 07 07 07
 * 08 08 08 08 08 08 08 08
 * 09 09 09 09 09 09 09 09 09
 * 10 10 10 10 10 10 10 10 10 10 
 * 11 11 11 11 11 11 11 11 11 11 11
 * 
 * @author java04
 *
 */

public class Piramide {
	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		Scanner leitor = new Scanner(System.in);
		int numero = leitor.nextInt();

		for (int linha = 1; linha <= numero; linha++) {
			for(int coluna = 1; coluna <= linha; coluna++){
				System.out.printf("%02d ", linha);
			}
			System.out.println();
		}
	}
}
