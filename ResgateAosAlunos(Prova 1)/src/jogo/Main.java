package jogo;

import presentation.*;

public class Main {

	public static void main(String[] args) {
		
		if(args.length > 0) {
			if(args[0].equals("--cli")) {
				Tela.setCli(true);
			}
		}
		
		Jogo jogo = new Jogo();
		jogo.jogar();
			
	}
	

}
