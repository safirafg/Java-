package ex1;

public class pregui�a extends animal {
	private String especie;
	private String habitat;

	public pregui�a(String nome, int idade, String som, String corre, String especie, String habitat) {
		super(nome, idade, som, corre);
		this.especie = especie;
		this.habitat = habitat;
	}

	public void imprimir() {
		System.out.println("\n\t\t\t Pregui�a: " + getNome() + "\n\nIdade: " + getIdade() + "\n\nSom: " + getSom()
				+ "\n\nCorre: " + getCorre() + "\n\nEsp�cie: " + especie + "\n\nHabitat: " + habitat);

	}

}
