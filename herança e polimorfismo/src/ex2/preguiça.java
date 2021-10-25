package ex2;

public class preguiça extends animal {
	private String especie;
	private String habitat;

	public preguiça(String nome, int idade, String som, String corre, String especie, String habitat) {
		super(nome, idade, som, corre);
		this.especie = especie;
		this.habitat = habitat;
	}

	public void imprimir() {
		System.out.println("\n\t\t\t Animal: " + getNome() + "\n\nIdade: " + getIdade() + "\n\nSom: " + getSom()
				+ "\n\nCorre: " + getCorre() + "\n\nEspécie: " + especie + "\n\nHabitat: " + habitat);

	}
	@Override
	public void somAnimal (String somA) {
		System.out.println("\nAhhhhhh ahhhhh ahhhhhh");
	}
	public void identifica (String inden) {
		System.out.println("\nPelo grito, aaaaaacho que é uma preguiça :)");
	}
}
