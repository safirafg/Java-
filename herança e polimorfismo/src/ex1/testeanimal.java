package ex1;

public class testeanimal {
	public static void main(String[] args) {
		cachorro morgana = new cachorro("Morgana", 2, "latido", "r�pido", "calma", "preta");
		morgana.imprimir();

		System.out.println("\n************************************");

		cavalo will = new cavalo("Will", 10, "relincha", "r�pido", "fr�sio", "masculino");
		will.imprimir();

		System.out.println("\n************************************");

		pregui�a sid = new pregui�a("Sid", 5, "grito", "lento", "pregui�a gigante", "mata atl�ntica");
		sid.imprimir();

	}
}
