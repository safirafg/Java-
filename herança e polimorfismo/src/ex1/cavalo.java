package ex1;

public class cavalo extends animal {
	private String raça;
	private String sexo;

	public cavalo(String nome, int idade, String som, String corre, String raça, String sexo) {
		super(nome, idade, som, corre);
		this.raça = raça;
		this.sexo = sexo;
	}

	public void imprimir() {
		System.out.println("\n\t\t\t Cavalo: " + getNome() + "\n\nIdade: " + getIdade() + "\n\nSom: " + getSom()
				+ "\n\nCorre: " + getCorre() + "\n\nRaça: " + raça + "\n\nSexo: " + sexo);

	}
}
