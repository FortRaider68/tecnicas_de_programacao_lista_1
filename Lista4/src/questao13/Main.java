package questao13;

public class Main {

	public static void main(String[] args) {
		Controle remoto = new Controle();
		remoto.power();
		
		remoto.aumentarVolume();
		remoto.aumentarVolume();
		remoto.aumentarVolume();

		System.out.println(remoto.estaLigada());
		System.out.println(remoto.getVolume());
		
	}

}
