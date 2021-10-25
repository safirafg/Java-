package brgeneration;

import java.util.*;

public class lacosRepeticao6 {
	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba vários números inteiros no teclado. E no
		 * final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero)
		 */
		int numero = 0, media = 0, soma = 0, cont = 0;
		Scanner leia = new Scanner(System.in);
		System.out.printf("\nPara sair, digite 0 a qualquer momento.");
		do {
			System.out.printf("\nInforme o número.");
			numero = leia.nextInt();
			if (numero % 3 == 0 && numero != 0) {
				soma += numero;
				cont++;

			}
		} while (numero != 0);
		media = soma / cont;
		System.out.printf("\nA média dos números inseridos é: %d", media);

	}

}
