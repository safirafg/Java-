package brgeneration;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class arrayVetor2 {

	/*
	 * Faça um programa que receba 6 números inteiros e mostre: • Os números pares
	 * digitados; • A soma dos números pares digitados; • Os números ímpares
	 * digitados; • A quantidade de números ímpares digitados.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Integer> numerosImpares = new ArrayList<>(); // função para listar os vetores e exibir os numeros depois
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

		System.out.println("\nNúmeros pares inseridos: " + numerosPares);

		System.out.println("\nSoma dos números pares: " + somaPar);

		System.out.println("\nNúmeros ímpares inseridos: " + numerosImpares);

		System.out.println("\nQuantidade de ímpares: " + numerosImpares.size());
	}

}
