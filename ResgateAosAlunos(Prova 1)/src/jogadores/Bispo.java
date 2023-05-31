package jogadores;

import jogo.Jogador;
import jogo.Personagem;
import jogo.Plano;

public class Bispo extends Robo {
	
	public Bispo(int posicaox, int posicaoy, Plano plano) {
		super(3, "Bispo", posicaox, posicaoy, plano,'B');
		posicaox+=getId();
		this.setPosicaox(posicaox);
	}

	public void avancar(int celulas) {
		if(celulas > 2)
			celulas = 2;
		this.deslocar(-celulas, celulas);
	}

	public void retroceder(int celulas) {
		if(celulas > 2)
			celulas = 2;
		this.deslocar(celulas, -celulas);
	}
}
