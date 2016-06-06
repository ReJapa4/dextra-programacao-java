package curso.aula1;

public class ExemplosLacos {

	public static void main(String[] args) {
		String minhaString = "Conteudo da minha String";
		int tamanho = minhaString.length();

		// percorrer usando WHILE
		int cont = 0;
		while (cont < tamanho) {
			System.out.print(minhaString.charAt(cont) + " ");
			cont++;
		}
		System.out.println();
		System.out.println();

		// percorrer usando WHILE e somar o conteudo do array
		int numeros[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int tamanho2 = numeros.length;
		int somaWhile = 0;
		int cont2 = 0;
		while (cont2 < tamanho2) {
			somaWhile = somaWhile + numeros[cont2];
			cont2++;
		}

		System.out.println(somaWhile);
		System.out.println();
		System.out.println();

		// percorrer usando FOR e somar o conteudo do array
		int somaFor = 0;
		for (cont2 = 0; cont2 < tamanho2; cont2++) {
			somaFor = somaFor + numeros[cont2];
		}

		System.out.println(somaFor);
		System.out.println();
		System.out.println();

		// percorrer usando foreach e somar o conteudo do array
		int somaForeach = 0;
		for (int num : numeros) {
			somaForeach = somaForeach + num;
		}
		System.out.println(somaForeach);
		System.out.println();
		System.out.println();

	}
}
