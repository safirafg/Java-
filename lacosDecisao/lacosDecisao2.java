package brgeneration;

import java.util.Scanner;

public class lacosDecisao2 {
	public static void main(String[] args) {
		/*
		 * Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		 */

		int numero1, numero2, numero3;

		Scanner leia = new Scanner(System.in);

		System.out.printf("\nInsira tr�s n�meros ");
		numero1 = leia.nextInt();
		numero2 = leia.nextInt();
		numero3 = leia.nextInt();

		if (numero1 <= numero2 && numero2 <= numero3) {
			System.out.printf("\nA ordem crescente �: %d, %d, %d. ", numero1, numero2, numero3);
		} else if (numero1 <= numero3 && numero3 <= numero2) {
			System.out.printf("\nA ordem crescente �: %d, %d, %d.", numero1, numero3, numero2);
		} else if (numero2 <= numero1 && numero1 <= numero3) {
			System.out.printf("\nA ordem crescente �: %d, %d, %d.", numero2, numero1, numero3);
		} else if (numero2 <= numero3 && numero3 <= numero1) {
			System.out.printf("\nA ordem crescente �: %d, %d, %d.", numero2, numero3, numero1);
		} else if (numero3 <= numero1 && numero1 <= numero2) {
			System.out.printf("\nA ordem crescente �: %d, %d, %d.", numero3, numero1, numero2);
		}

		else // numero3 <= numero2 && numero2 < numero1
		{
			System.out.printf("\nA ordem crescente �: %d, %d, %d.", numero3, numero2, numero1);
		}

	}

}
