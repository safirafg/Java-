package brgeneration;

import java.util.Scanner;

public class lacosRepeticao {
	public static void main(String[] args) {
		/*
		 * Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos
		 * resto = 5. (FOR)
		 */
		int numero;

		Scanner leia = new Scanner(System.in);

		for (numero = 1000; numero <= 1999; numero++) {
			if (numero % 11 == 5) {
				System.out.printf("\nNúmero: %d \n", numero);

			}
		}
	}
}


