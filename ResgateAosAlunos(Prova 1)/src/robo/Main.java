package robo;

import presentation.*;

public class Main {

	public static void main(String[] args) {
		
		if(args.length > 0) {
			if(args[0].equals("--cli")) {
				Tela.cli = true;
			}
		}
		
//		Plano p = new Plano(2, 2);
		Jogo jogo = new Jogo();
		jogo.jogar();
			
	}
	

}
