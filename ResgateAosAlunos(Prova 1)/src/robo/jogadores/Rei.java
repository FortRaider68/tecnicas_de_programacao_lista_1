package robo.jogadores;

import robo.Jogador;
import robo.Plano;
import robo.Personagem;

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
