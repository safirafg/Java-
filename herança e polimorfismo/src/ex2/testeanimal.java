package ex2;

public class testeanimal {
	public static void main(String[] args) {
		cachorro morgana = new cachorro("Morgana", 2, "latido", "rápido", "calma", "preta");
		morgana.imprimir();
		morgana.somAnimal(null);
		morgana.identifica(null);
		

		System.out.println("\n************************************");

		cavalo will = new cavalo("Will", 10, "relincha", "rápido", "frísio", "masculino");
		will.imprimir();
		will.somAnimal(null);
		will.identifica(null);
		
		System.out.println("\n************************************");

		preguiça sid = new preguiça("Sid", 5, "grito", "lento", "preguiça gigante", "mata atlântica");
		sid.imprimir();
		sid.somAnimal(null);
		sid.identifica(null);
		

	}
}
