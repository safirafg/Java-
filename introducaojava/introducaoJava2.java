package brgeneration;

import java.util.Scanner;

public class introducaoJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fa�a um sistema que que leia a idade de uma pessoa expressa em dias e
		 * mostre-a expressa em anos, meses e dias
		 */

		int totaldias, anos, meses, dias;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite a quantidade total de dias que voc� j� viveu!");

		totaldias = leia.nextInt();

		anos = totaldias / 365;
		meses = (totaldias % 365) / 30;
		dias = (totaldias % 365) % 30;

		System.out.println("\nVoc� possui: " + anos + " ano(s)," + meses + (" meses e ") + dias + (" dias de vida."));

	}

}
