package jogadores;

import jogo.Coordenadas;
import jogo.Personagem;
import jogo.Plano;

public class Peao extends Robo {
	
	public Peao(int posicaox, int posicaoy, Plano plano) {
		super(1, "Peão",new Coordenadas(posicaox, posicaoy), plano,'P');
		posicaox+=getId();
		this.deslocar(new Coordenadas(posicaox, posicaoy));
	}
	
	public Coordenadas avancar(int celulas) {
		if(celulas > 1)
			celulas = 1;
		Coordenadas coordenadas = new Coordenadas(this.getPosicaox()+celulas, this.getPosicaoy());
		return coordenadas;
	}

	public Coordenadas retroceder(int celulas) {
		if(celulas > 1)
			celulas = 1;
		Coordenadas coordenadas = new Coordenadas(this.getPosicaox()-celulas, this.getPosicaoy());	
		return coordenadas;
	}

}
