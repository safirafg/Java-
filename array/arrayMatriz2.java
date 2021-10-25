package brgeneration;

import java.util.*;

public class arrayMatriz2 {
	public static void main(String[] args) {

		/*
		 * Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao
		 * usu�rio um menu de op��es: (1) somar as duas matrizes (2) subtrair a primeira
		 * matriz da segunda (3) adicionar uma constante as duas matrizes (4) imprimir
		 * as matrizes Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser
		 * criada. Na terceira op��o o valor da constante deve ser lido e o resultado da
		 * adi��o da constante deve ser armazenado na pr�pria matriz.
		 */
		float matriz1[][] = new float[2][2];
		float matriz2[][] = new float[2][2];
		float matriz3[][] = new float[2][2];

		int x, y, op, n;
		
		
		Scanner leia = new Scanner(System.in);

		for(x=0; x<2; x++) {
			for (y=0; y<2; y++) { 
				System.out.println("\nInsira o valor da matriz 1.");
				matriz1[x][y] = leia.nextFloat();
				System.out.println("\nInsira o valor da matriz 2.");
				matriz2[x][y] = leia.nextFloat();
			}
		}
		System.out.println("\n\t\t Menu de op��es: ");
		System.out.println("\n1 - Somar duas matrizes;");
		System.out.println("\n2 - Subtrair a primeira matriz da segunda;");
		System.out.println("\n3 - Adicionar uma constante as duas matrizes;");
		System.out.println("\n4 - Imprimir as matrizes.");
		System.out.println("\nDigite uma op��o: ");
		op = leia.nextInt();
		
		while (op<1 || op>4) { 
			System.out.println("\nOp��o inv�lida, tente novamente.");
			System.out.println("\n\t\t Menu de op��es: ");
			System.out.println("\n1 - Somar duas matrizes;");
			System.out.println("\n2 - Subtrair a primeira matriz da segunda;");
			System.out.println("\n3 - Adicionar uma constante as duas matrizes;");
			System.out.println("\n4 - Imprimir as matrizes.");
			System.out.println("\nDigite uma op��o: ");
			op = leia.nextInt();
		}
		do {
			switch (op) {
			case 1: 
				for(x=0; x<2; x++) {
					for (y=0; y<2; y++) { 
						matriz3[x][y] = matriz1 [x][y] + matriz2 [x][y];
						System.out.println("\nA soma das matrizes �: "+matriz3 [x][y]);
					}
				
			}
				break;
			case 2: 
				for(x=0; x<2; x++) {
					for (y=0; y<2; y++) { 
						matriz3[x][y] = matriz2 [x][y] - matriz1 [x][y];
						System.out.println("\nA diferen�a entre matrizes �: "+matriz3 [x][y]);
					}
				
			}
				break;
			case 3:
				System.out.println("\nInsira um n�mero.");
				n = leia.nextInt();
				for(x=0; x<2; x++) {
					for (y=0; y<2; y++) { 
						matriz1[x][y] += n;
						matriz2[x][y] += n;
						System.out.println("\nMatriz 1: "+ matriz1[x][y]);
						System.out.println("\nMatriz 2: "+ matriz2[x][y]);
					}
		}
				break;
			case 4:
				for(x=0; x<2; x++) {
					for (y=0; y<2; y++) { 
						System.out.println("\nMatriz 1:"+ matriz1[x][y]);
						System.out.println("\nMatriz 2: "+ matriz2[x][y]);
					}
					}
				break;
				default:
					System.out.println("\nOp��o inv�lida, tente novamente!");
					
			}
			System.out.println("\n\t\t Menu de op��es: ");
			System.out.println("\n1 - Somar duas matrizes;");
			System.out.println("\n2 - Subtrair a primeira matriz da segunda;");
			System.out.println("\n3 - Adicionar uma constante as duas matrizes;");
			System.out.println("\n4 - Imprimir as matrizes.");
			System.out.println("\nDigite uma op��o: ");
			op = leia.nextInt();
		}
					while (op!=0);
			}
			}
		


