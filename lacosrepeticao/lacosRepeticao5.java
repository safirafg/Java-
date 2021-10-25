package brgeneration;

import java.util.*;

public class lacosRepeticao5 {
public static void main(String[] args) {
	
	/*
	 * Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.
	 */
	int numeros=0, somanumeros=0;
	
	Scanner leia = new Scanner (System.in);
	
	do {
		 
		System.out.printf("\nInsira um número.");
		numeros = leia.nextInt();
			if (numeros>=1) {
			somanumeros += numeros;
			
          }
		
		
		}
	while (numeros!=0);
	System.out.printf("\nA soma dos números é: %d", somanumeros);
}
}
