package ex1;

public class cachorro extends animal {
	private String temperamento;
	private String cor;
	

	public cachorro(String nome, int idade, String som, String corre, String temperamento, String cor) {
		super(nome, idade, som, corre);
		this.temperamento = temperamento;
		this.cor = cor;
		
	}

	public void imprimir() {
		System.out.println(
				"\n\t\t\t Cachorro: " + getNome() + "\n\nIdade: " + getIdade() + "\n\nSom: " + getSom() + "\n\nCorre: "
						+ getCorre() + "\n\nTemperamento: " + temperamento + "\n\nCor: " + cor);
	}

}
