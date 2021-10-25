package brgeneration;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class arrayVetor2 {

	/*
	 * Fa�a um programa que receba 6 n�meros inteiros e mostre: � Os n�meros pares
	 * digitados; � A soma dos n�meros pares digitados; � Os n�meros �mpares
	 * digitados; � A quantidade de n�meros �mpares digitados.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Integer> numerosImpares = new ArrayList<>(); // fun��o para listar os vetores e exibir os numeros depois
		List<Integer> numerosPares = new ArrayList<>();

		int numero, somaPar = 0;

		for (int i = 0; i < 6; i++) {
			System.out.printf("Insira os valores: ");
			numero = scan.nextInt();

			if (numero % 2 == 0) {

				numerosPares.add(numero);

				somaPar += numero;

			} else {

				numerosImpares.add(numero);

			}

		}

		System.out.println("\nN�meros pares inseridos: " + numerosPares);

		System.out.println("\nSoma dos n�meros pares: " + somaPar);

		System.out.println("\nN�meros �mpares inseridos: " + numerosImpares);

		System.out.println("\nQuantidade de �mpares: " + numerosImpares.size());
	}

}
