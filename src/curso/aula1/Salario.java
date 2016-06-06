package curso.aula1;

import java.util.Scanner;
/**
 * Escreva um programa para ler o salario de uma pessoa e imprimir o desconto do INSS segundo tabela abaixo:
 * menor ou igual a R$ 600 - Isento;
 * maior do que R$ 600 e menor ou igual a R$ 1.200,00 - 20%;
 * maior que R$ 1200 e menor ou igual a R$ 2000 - 25%;
 * maior que R$ 2000 - 30%
 * @author java04
 *
 */


public class Salario {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite salario: ");
		double salario = leitor.nextDouble();
		
		if (salario <= 600.00){
			System.out.println("Isento");
		} else if (salario > 600.00 && salario <= 1200.00){
			System.out.println("20%");
		} else if (salario > 1200.00 && salario <= 2000.00){
			System.out.println("25%");
		} else if (salario > 2000.00){
			System.out.println("30%");
		}				
	}
}
