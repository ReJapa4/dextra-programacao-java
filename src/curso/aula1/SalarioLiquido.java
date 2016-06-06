package curso.aula1;

import java.util.Scanner;

/**
 * Escreva um programa que efetue o calculo do salario bruto e do salario liquido de um empregado.
 * Os dados fornecidos são:
 * O valor do salario hora;
 * O número de horas trabalhadas no mês;
 * O percentual de desconto do INSS;
 * 
 * @author java04
 *
 */

public class SalarioLiquido {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite salario hora: ");
		double salarioH = leitor.nextDouble();
		
		System.out.println("Digite horas trabalhadas: ");
		int horast = leitor.nextInt();
		
		System.out.println("Digite percentual de INSS: ");
		double percent = leitor.nextDouble();
		
		double salarioBruto = (salarioH * horast);
		double salarioLiquido = salarioBruto - (salarioBruto * percent);
		
		System.out.println(salarioLiquido);
	}	
}
