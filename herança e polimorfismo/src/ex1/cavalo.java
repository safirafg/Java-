package ex1;

public class cavalo extends animal {
	private String ra�a;
	private String sexo;

	public cavalo(String nome, int idade, String som, String corre, String ra�a, String sexo) {
		super(nome, idade, som, corre);
		this.ra�a = ra�a;
		this.sexo = sexo;
	}

	public void imprimir() {
		System.out.println("\n\t\t\t Cavalo: " + getNome() + "\n\nIdade: " + getIdade() + "\n\nSom: " + getSom()
				+ "\n\nCorre: " + getCorre() + "\n\nRa�a: " + ra�a + "\n\nSexo: " + sexo);

	}
}
