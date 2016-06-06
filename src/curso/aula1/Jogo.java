package curso.aula1;

import java.util.Random;
import java.util.Scanner;

/**
 * Crie um jogo para o usuário descobrir um numero sorteado de 1 a 10. Cada
 * tentativa dele, forneça uma dica mostrando se o numero é maior ou menor.
 * Quando ele descobrir, exiba uma mensagem de parabéns e mostre em quantas
 * tentativa ele conseguiu.
 * 
 * @author java04
 *
 */

public class Jogo {
	public static void main(String[] args) {
		int numeroAleatorio = new Random(System.currentTimeMillis()).nextInt(10) + 1;
		System.out.println("Digite um numero entre 1 a 10: ");
		Scanner leitor = new Scanner(System.in);
		int lance = leitor.nextInt();
		int cont = 1;

		while (lance != numeroAleatorio) {
			if (lance < numeroAleatorio) {
				System.out.println("O numero ditado é menor que o numero sorteado!!!");
			} else if (lance > numeroAleatorio) {
				System.out.println("O numero ditado é maior que o numero sorteado!!!");
			}
			cont = cont + 1;
			System.out.println("Digite um numero entre 1 a 10: ");
			lance = leitor.nextInt();
		}
		
		System.out.println("PARABENS!!! Foram " + cont + " tentativas!");
	}
}
