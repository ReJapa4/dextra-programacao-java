package curso.aula1;

import java.util.Scanner;

public class ExemploSwitchIf {
	
	public static void main(String[] args) {
		
		System.out.println("Informe a opcao para if:");
		
		Scanner leitor = new Scanner (System.in);
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			System.out.println("Vc selecionou a opcao 1");
		} else if (opcao == 2) {
			System.out.println("Vc selecionou a opcao 2");
		} else if (opcao == 3) {
			System.out.println("Vc selecionou a opcao 3");
		} else {
			System.out.println("Opcao desconhecida");
		}
		
		System.out.println("Informe a opcao para switch:");
		opcao = leitor.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Vc selecionou a opcao 1");
			break;
		case 2:
			System.out.println("Vc selecionou a opcao 2");
			break;
		case 3:
			System.out.println("Vc selecionou a opcao 3");
			break;
		default:
			System.out.println("Opcao desconhecida");
		}
		
	}

}
