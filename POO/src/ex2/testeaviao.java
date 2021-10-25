package ex2;

public class testeaviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aviao aviao1 = new aviao("Boeing 274", "320 km/h", "encardido");
		aviao aviao2 = new aviao("Boeing 707", "960 km/h", "branco");
		aviao1.imprimirInfo();

		System.out.println("\n\t\t\t ALERTA DE SUBSTITUIÇÃO DE COR DA AERONAVE");
		aviao1.setCor("branco");
		aviao1.imprimirInfo();

		System.out.println("\n\t\t\t ATENÇÃO: MUDANÇA DE AERONAVE");
		aviao2.setModelo("airbus380");
		aviao2.imprimirInfo();
	}

}
