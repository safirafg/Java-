package brgeneration;

import java.util.Scanner;

public class introducaoJava3 {
	public static void main(String[] args) {
		/*
		 * Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		 * expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		 */
		int horas, minutos, segundos;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nInsira quantos segundos durou o evento.");
		segundos = leia.nextInt();

		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundos = (segundos % 3600) % 60;

		System.out.println("\nO evento durou " + horas + " horas " + minutos + " minutos " + segundos + " segundos.");
	}
}
