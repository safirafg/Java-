package brgeneration;

import java.util.Scanner;

public class lacosDecisao4 {
	public static void main(String[] args) {

		/*
		 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se
		 * este n�mero � par ou �mpar. Se ele for par exiba tamb�m a raiz quadrada dele.
		 * Se for �mpar, exiba o n�mero elevado ao quadrado.
		 */

		int numero;
		double raiz, potencia;

		Scanner leia = new Scanner(System.in);

		System.out.printf("\nInsira um n�mero inteiro.");
		numero = leia.nextInt();
		if (numero % 2 == 0) {
			System.out.printf("\nO n�mero %d � par.", numero);
			raiz = Math.sqrt(numero);
			System.out.printf("\nA raiz quadrada do n�mero %d � %.2f", numero, raiz);
		} else if (numero % 2 != 0) {
			System.out.printf("\nO n�mero %d � �mpar.", numero);
			potencia = Math.pow(numero, 2);
			System.out.printf("\nA pot�ncia de %d � %.1f.", numero, potencia);

		}
	}
}
