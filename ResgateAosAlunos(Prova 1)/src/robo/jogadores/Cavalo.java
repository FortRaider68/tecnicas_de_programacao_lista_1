package robo.jogadores;

import robo.Jogador;
import robo.Plano;
import robo.Personagem;

public class Cavalo extends Robo {
	
	public Cavalo(int posicaox, int posicaoy, Plano plano) {
		super(4, "Cavalo", posicaox, posicaoy, plano,'C');
		posicaox+=getId();
		this.setPosicaox(posicaox);
	}

	public void avancar(int celulas) {
		if(celulas > 2)
			celulas = 2;
		this.deslocar(celulas, celulas);
	}

	public void retroceder(int celulas) {
		if(celulas > 2)
			celulas = 2;
		this.deslocar(-celulas, -celulas);
	}
}
