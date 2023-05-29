package robo;

import presentation.*;

public class Main {

	public static void main(String[] args) {
		
		if(args.length > 0) {
			if(args[0].equals("--cli")) {
				Tela.cli = true;
			}
		}
		
		Jogo jogo = new Jogo();
		jogo.jogar();
			
	}
	

}
