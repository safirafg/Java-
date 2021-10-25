package ex1;

public class testeanimal {
	public static void main(String[] args) {
		cachorro morgana = new cachorro("Morgana", 2, "latido", "rápido", "calma", "preta");
		morgana.imprimir();

		System.out.println("\n************************************");

		cavalo will = new cavalo("Will", 10, "relincha", "rápido", "frísio", "masculino");
		will.imprimir();

		System.out.println("\n************************************");

		preguiça sid = new preguiça("Sid", 5, "grito", "lento", "preguiça gigante", "mata atlântica");
		sid.imprimir();

	}
}
