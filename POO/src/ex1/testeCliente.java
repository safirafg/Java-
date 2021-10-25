package ex1;

public class testeCliente {
public static void main(String[] args) {
	cliente[] lista = new cliente [3];
	lista[0] = new cliente ("Safira",20, 20);
	lista[1] = new cliente ("Maria",500, 500);
	lista[2] = new cliente ("Renan",650, 650);
	
	for (cliente roda:lista) {
		roda.imprimirSaldo();
	}
	System.out.println("\n*************************************************");
	for (cliente roda:lista) {
		roda.ganhaPontos();
		roda.imprimirPontos();

	}
	
}
}
