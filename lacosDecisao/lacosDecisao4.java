package brgeneration;

import java.util.Scanner;

public class lacosDecisao4 {
	public static void main(String[] args) {

		/*
		 * Faça um programa em que permita a entrada de um número qualquer e exiba se
		 * este número é par ou ímpar. Se ele for par exiba também a raiz quadrada dele.
		 * Se for ímpar, exiba o número elevado ao quadrado.
		 */

		int numero;
		double raiz, potencia;

		Scanner leia = new Scanner(System.in);

		System.out.printf("\nInsira um número inteiro.");
		numero = leia.nextInt();
		if (numero % 2 == 0) {
			System.out.printf("\nO número %d é par.", numero);
			raiz = Math.sqrt(numero);
			System.out.printf("\nA raiz quadrada do número %d é %.2f", numero, raiz);
		} else if (numero % 2 != 0) {
			System.out.printf("\nO número %d é ímpar.", numero);
			potencia = Math.pow(numero, 2);
			System.out.printf("\nA potência de %d é %.1f.", numero, potencia);

		}
	}
}
