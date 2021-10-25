package ex2;

public class aviao {
	/*
	 * Crie uma classe avi�o e apresente os atributos e m�todos referentes esta
	 * classe, em seguida crie um objeto avi�o, defina as instancias deste objeto e
	 * apresente as informa��es deste objeto no console.
	 */
	private String modelo;
	private String velocidade;
	private String cor;

	public aviao(String modelo, String velocidade, String cor) {
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void imprimirInfo() {
		System.out.println("\nO " + modelo + ", que alcan�a a velocidade " + velocidade + ", tem a cor " + cor);
	}
}
