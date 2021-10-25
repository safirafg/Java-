package ex2;

public abstract class animal {
	/*
	 *  Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.
	 */
	private String nome;
	private int idade;
	private String som;
	private String corre;
	abstract public void somAnimal(String somA);
	abstract public void identifica(String iden);
	
	
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
	public void somAnimal() { }
	
}

