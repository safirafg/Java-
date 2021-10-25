package brgeneration;

import java.util.Scanner;

public class lacosRepeticao2 {
	public static void main(String[] args) {
		/*
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. FOR.
		 */

		Scanner leia = new Scanner(System.in);

		int numero, x, somapar = 0, somaimpar = 0;

		for (x = 1; x < 11; x++) {
			System.out.printf("\nInsira um número inteiro maior que zero.");
			numero = leia.nextInt();
			if (numero % 2 == 0) {
				somapar++;
			} else
				somaimpar++;
		}
		System.out.printf("\nOs números pares são %d .", somapar);
		System.out.printf("\nOs números ímpares são %d .", somaimpar);
	}
}
