package curso.aula1;

/**
 * Faca um programa que exiba todos os números pares de 10 a 200.
 * 
 * @author java04
 *
 */
public class Pares {
	public static void main(String[] args) {
		int i = 10;

		while (i <= 200) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i = i + 1;
		}
	}
}
