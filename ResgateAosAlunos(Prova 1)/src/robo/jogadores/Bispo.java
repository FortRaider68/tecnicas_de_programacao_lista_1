package robo.jogadores;

import robo.Jogador;
import robo.Plano;
import robo.Personagem;

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
