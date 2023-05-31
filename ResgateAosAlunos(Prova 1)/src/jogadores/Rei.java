package jogadores;

import jogo.Jogador;
import jogo.Personagem;
import jogo.Plano;

public class Rei extends Robo {
	public Rei(int posicaox, int posicaoy, Plano plano) {
		super(5, "Rei", posicaox, posicaoy, plano,'R');
		posicaox+=getId();
		this.setPosicaox(posicaox);
	}
	public void avancar(int celulas) {
		if(celulas > 4)
			celulas = 4;
		this.deslocar(celulas, celulas);
	}

	public void retroceder(int celulas) {
		if(celulas > 4)
			celulas = 4;
		this.deslocar(-celulas, -celulas);
	}
}
