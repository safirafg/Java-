package ex1;

import java.text.NumberFormat;

public class cliente {

	/*
	 * Crie uma classe cliente e apresente os atributos e métodos referentes esta
	 * classe, em seguida crie um objeto cliente, defina as instancias deste objeto
	 * e apresente as informações deste objeto no console.
	 */

	private String nome;
	private double pontos,saldo;

	public cliente(String n, double p, double s) {
		this.setNome(n);
		this.setPontos(p);
		this.setSaldo(s);

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPontos() {
		return pontos;
	}

	public void setPontos(double pontos) {
		this.pontos = pontos;
	}

	public void ganhaPontos() {
		pontos = saldo*1;
	}

	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(saldo);
		return formatoMoeda;
	}

	public void imprimirSaldo() {
		System.out.println("\n" + nome + "\t\t\t" + "valor gasto: " + this.formatarMoeda());
	}
	public void imprimirPontos() {
		System.out.println("\n" + nome + "\t\t\t" + "pontos: " + this.pontos);
	}
	}

