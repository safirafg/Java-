package brgeneration;

import java.util.*;

public class lacosRepeticao6 {
	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		 * final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero)
		 */
		int numero = 0, media = 0, soma = 0, cont = 0;
		Scanner leia = new Scanner(System.in);
		System.out.printf("\nPara sair, digite 0 a qualquer momento.");
		do {
			System.out.printf("\nInforme o n�mero.");
			numero = leia.nextInt();
			if (numero % 3 == 0 && numero != 0) {
				soma += numero;
				cont++;

			}
		} while (numero != 0);
		media = soma / cont;
		System.out.printf("\nA m�dia dos n�meros inseridos �: %d", media);

	}

}
