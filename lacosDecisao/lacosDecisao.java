package brgeneration;

import java.util.Scanner;

public class lacosDecisao {
	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba tr�s inteiro e diga qual deles � o maior.
		 */

		int valor1, valor2, valor3, maior;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nInsira tr�s valores: ");
		valor1 = leia.nextInt();
		valor2 = leia.nextInt();
		valor3 = leia.nextInt();

		if (valor1 > valor2) {
			if (valor1 > valor3)
				maior = valor1;
			else
				maior = valor3;
		}

		else {
			if (valor2 > valor3)
				maior = valor2;
			else
				maior = valor3;
		}

		System.out.printf("O maior valor digitado foi %d.", maior);
	}
}
