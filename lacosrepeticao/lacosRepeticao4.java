package brgeneration;

import java.util.*;

public class lacosRepeticao4 {
	public static void main(String[] args) {
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
		 * psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
		 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as
		 * op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa
		 * era agressiva). Pede-se para elaborar um sistema que permita ler os dados de
		 * 150 pessoas, calcule e mostre: (WHILE) o n�mero de pessoas calmas; o n�mero
		 * de mulheres nervosas; o n�mero de homens agressivos; o n�mero de outros
		 * calmos; o n�mero de pessoas nervosas com mais de 40 anos; o n�mero de pessoas
		 * calmas com menos de 18 anos.
		 */
		int idade = 0, sexo = 0, temperamento = 0, indcalmo = 0, mulhernerv = 0, homemagres = 0, outroscalmos = 0,
				indnerv40 = 0, indcalm18 = 0, x = 1;

		Scanner leia = new Scanner(System.in);

		while (x <= 150) {
			System.out.println("\nDigite a idade: ");
			idade = leia.nextInt();
			while (idade < 0) {
				System.out.println("\nO que voc� digitou � inv�lido. Tente novamente.");
				idade = leia.nextInt();
			}

			System.out.println("\nInsira o g�nero: \n1 - Feminino \n2- Masculino \n3 - Outros");
			sexo = leia.nextInt();

			while (sexo < 1 || sexo > 3) {
				System.out.println("\nO que voc� digitou � inv�lido. Tente novamente.");
				sexo = leia.nextInt();
			}
			System.out.println("\nInsira o temperamento: \n1- Calmo(a) \n2-Nervoso(a) \n3- Agressivo(a) ");
			temperamento = leia.nextInt();

			while (temperamento < 1 || temperamento > 3) {
				System.out.println("\nO que voc� digitou � inv�lido. Tente novamente");
				temperamento = leia.nextInt();
			}
			if (temperamento == 1) {
				indcalmo++;
			}
			if (temperamento == 2 && sexo == 1) {
				mulhernerv++;
			}
			if (temperamento == 3 && sexo == 2) {
				homemagres++;
			}
			if (temperamento == 1 && sexo == 3) {
				outroscalmos++;
			}
			if (temperamento == 2 && idade >= 40) {
				indnerv40++;
			}
			if (temperamento == 1 && idade <= 18) {
				indcalm18++;
			}
			x++;

		}
		System.out.printf("\nO n�mero de pessoas calmas � %d", indcalmo);
		System.out.printf("\nO n�mero de mulheres nervosas � %d", mulhernerv);
		System.out.printf("\nO n�mero de homens agressivos � %d", homemagres);
		System.out.printf("\nO n�mero de outros calmos � %d", outroscalmos);
		System.out.printf("\nO n�mero de pessoas nervosas com mais de 40 anos � %d", indnerv40);
		System.out.printf("\nO n�mero de pessoas calmas com menos 18 anos � %d", indcalm18);

	}
}
