package questao16;

public class Main {

	public static void main(String[] args) {
		Elevador elevador = new Elevador(12, 8);
		for (int i = 0; i < 11; i++) {
			elevador.entra();
		}
		
		elevador.sobe();
		System.out.println(elevador.getPassageiros());
		System.out.println(elevador.getAndar());
		elevador.sobe();
		elevador.desce();
		elevador.sobe();
		System.out.println(elevador.getAndar());

	}

}
