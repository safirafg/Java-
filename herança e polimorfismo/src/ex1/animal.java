package ex1;

public class animal {
	/*
	 * Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
	 * comportamentos (observe a tabela), utilize os seus conhecimentos e distribua
	 * as características de forma que tudo o que for comum a todos os animais fique
	 * na classe Animal
	 */
	private String nome;
	private int idade;
	private String som;
	private String corre;

	public animal(String nome, int idade, String som, String corre) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.corre = corre;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}

}
