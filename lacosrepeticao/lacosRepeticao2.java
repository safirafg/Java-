package brgeneration;

import java.util.Scanner;

public class lacosRepeticao2 {
	public static void main(String[] args) {
		/*
		 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. FOR.
		 */

		Scanner leia = new Scanner(System.in);

		int numero, x, somapar = 0, somaimpar = 0;

		for (x = 1; x < 11; x++) {
			System.out.printf("\nInsira um n�mero inteiro maior que zero.");
			numero = leia.nextInt();
			if (numero % 2 == 0) {
				somapar++;
			} else
				somaimpar++;
		}
		System.out.printf("\nOs n�meros pares s�o %d .", somapar);
		System.out.printf("\nOs n�meros �mpares s�o %d .", somaimpar);
	}
}
