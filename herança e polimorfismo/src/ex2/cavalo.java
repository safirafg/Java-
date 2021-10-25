package ex2;

public class cavalo extends animal {
	private String raça;
	private String sexo;

	public cavalo(String nome, int idade, String som, String corre, String raça, String sexo) {
		super(nome, idade, som, corre);
		this.raça = raça;
		this.sexo = sexo;
	}

	public void imprimir() {
		System.out.println("\n\t\t\t Animal: " + getNome() + "\n\nIdade: " + getIdade() + "\n\nSom: " + getSom()
				+ "\n\nCorre: " + getCorre() + "\n\nRaça: " + raça + "\n\nSexo: " + sexo);

	}
	@Override
	public void somAnimal (String somA) {
		System.out.println("\nInhinhinhinhin");
	}
	public void identifica (String inden) {
		System.out.println("\nPelo relinchar, aaaaaacho que é um cavalo :)");
	}
}
