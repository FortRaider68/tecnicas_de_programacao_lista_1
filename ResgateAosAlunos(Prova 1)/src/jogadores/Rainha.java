package jogadores;

import jogo.Jogador;
import jogo.Personagem;
import jogo.Plano;

public class Rainha extends Robo {
	public Rainha(int posicaox, int posicaoy, Plano plano) {
		super(6, "Rainha", posicaox, posicaoy, plano,'Q');
		posicaox+=getId();
		this.setPosicaox(posicaox);
	}

	public void avancar(int celulas) {
		if(celulas > 4)
			celulas = 4;
		this.deslocar(-celulas, celulas);
	}

	public void retroceder(int celulas) {
		if(celulas > 4)
			celulas = 4;
		this.deslocar(celulas, -celulas);
	}
}
