package jogadores;

import jogo.Jogador;
import jogo.Personagem;
import jogo.Plano;

public class Torre extends Robo {
	
	public Torre(int posicaox, int posicaoy, Plano plano) {
		super(2, "Torre", posicaox, posicaoy, plano,'T');
		posicaox+=getId();
		this.setPosicaox(posicaox);
	}

	public void avancar(int celulas) {
		if(celulas > 2)
			celulas = 2;
		this.deslocar(celulas, 0);
	}

	public void retroceder(int celulas) {
		if(celulas > 2)
			celulas = 2;
		this.deslocar(-celulas,0);
	}
}
