package brgeneration;

import java.util.*;

public class lacosRepeticao3 {
	public static void main(String[] args) {
		/*
		 * Solicitar a idade de várias pessoas e imprimir: total de pessoas com menos de
		 * 21 anos e o total de pessoas com mais de 50 anos. O programa termina quando a
		 * idade for = 99.
		 */

		int idade = 0, menor21 = 0, maior50 = 0;

		Scanner leia = new Scanner(System.in);

		System.out.printf("\nDigite a sua idade: ");
		idade = leia.nextInt();

		while (idade != 99) {
			System.out.printf("\nDigite a sua idade: ");
			idade = leia.nextInt();

			if (idade <= 21) {
				menor21++;
			} else if (idade >= 50) {
				maior50++;
			}
		}
		System.out.printf("\nTotal de pessoas com menos de 21 anos: %d", menor21);
		System.out.printf("\nTotal de pessoas com mais de 50 anos: %d", maior50);
	}

}
