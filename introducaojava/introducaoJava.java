package brgeneration;

import java.util.Scanner;

public class introducaoJava {
	public static void main(String[] args) {
		/*
		 * Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias
		 * e mostre-as expressa apenas em dias.
		 */

		int anos, meses, dias;

		System.out.println("\nQuantos anos, meses e dias de nascido(a) voc� tem? ");
		Scanner leia = new Scanner(System.in);

		anos = leia.nextInt();
		meses = leia.nextInt();
		dias = leia.nextInt();

		System.out.println("\nVoc� tem " + ((anos * 365) + (meses * 30) + dias) + " dias de nascido(a)!");

	}

}
