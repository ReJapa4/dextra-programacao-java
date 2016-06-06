package curso.aula1;

import java.util.Scanner;

/**
 * Escreva um programa para ler o nome de um correntista de um banco, seu saldo
 * inicial e varios lançamentos. O objetivo do programa é calcular o saldo final
 * do correntista após serem contablizados os lançamentos lidos. Cada lançamento
 * deve ter um tipo e um valor. Os tipos devem ser: 1 - débito (o valor deve ser
 * subtraido do saldo inicial); 2 - credito (o valor deve ser somado ao saldo
 * inicial);
 * 
 * O programa deverá terminar ao ser lido um lançamento de tipo 3. Antes de
 * encerrar o programa devera informar o saldo final do correntista.
 * 
 * @author java04
 *
 */

public class BancoCd {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = leitor.next();

		System.out.println("Digite saldo: ");
		double saldoI = leitor.nextDouble();

		System.out.println("Digite o tipo de lancamento: ");
		int lanc = leitor.nextInt();

		double saldoF = saldoI;

		while (lanc < 3) {
			System.out.println("Digite valor do lancamento: ");
			double valor = leitor.nextDouble();
			if (lanc == 1) {
				saldoF = saldoF - valor;
				System.out.println("Digite o tipo de lancamento: ");
				lanc = leitor.nextInt();
			} else if (lanc == 2) {
				saldoF = saldoF + valor;
				System.out.println("Digite o tipo de lancamento: ");
				lanc = leitor.nextInt();
			} else
				System.out.println("Opcao invalida");
		}
		System.out.println(nome + ", seu saldo total é: " + saldoF);

	}

}
