package jogadores;

import jogo.Jogador;
import jogo.Personagem;
import jogo.Plano;

public class Peao extends Robo {
	
	public Peao(int posicaox, int posicaoy, Plano plano) {
		super(1, "Peão", posicaox, posicaoy, plano,'P');
		posicaox+=getId();
		this.setPosicaox(posicaox);
	}

	public void avancar(int celulas) {
		if(celulas > 1)
			celulas = 1;
		this.deslocar(celulas, 0);
	}

	public void retroceder(int celulas) {
		if(celulas > 1)
			celulas = 1;
		this.deslocar(-celulas,0);
	}
}
