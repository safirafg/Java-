package brgeneration;

import java.util.Scanner;

public class lacosDecisao3 {
	public static void main(String[] args) {
		/*
		 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		 * categoria ela se encontra: *10-14 infantil, *15-17juvenil, *18-25 adulto
		 */

		int idade;

		Scanner leia = new Scanner(System.in);
		idade = leia.nextInt();

		if (idade < 10) {
			System.out.println("\nCompetidor(a) não possui a idade mínima, portanto não há categoria.");
		}

		if (idade >= 10 && idade <= 14) {
			System.out.println("\nCategoria infantil.");
		}
		if (idade >= 15 && idade <= 17) {
			System.out.println("\nCategoria juvenil.");
		}
		if (idade >= 18 && idade <= 25) {
			System.out.println("\nCategoria adulto.");
		}
		if (idade > 25) {
			System.out.println("\nCompetidor(a) ultrapassou a idade máxima, portanto não há categoria.");
		}
	}
}
