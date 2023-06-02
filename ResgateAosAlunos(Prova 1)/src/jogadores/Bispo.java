package jogadores;

import jogo.Coordenadas;
import jogo.Personagem;
import jogo.Plano;

public class Bispo extends Robo {
	
	public Bispo(int posicaox, int posicaoy, Plano plano) {
		super(3, "Bispo", new Coordenadas(posicaox, posicaoy), plano,'B');
		posicaox+=getId();
		this.deslocar(new Coordenadas(posicaox, posicaoy));
	}

	public Coordenadas avancar(int celulas) {
		if(celulas > 2)
			celulas = 2;
		Coordenadas coordenadas = new Coordenadas(this.getPosicaox()-celulas, this.getPosicaoy()+celulas);;
		return coordenadas;
	}

	public Coordenadas retroceder(int celulas) {
		if(celulas > 2)
			celulas = 2;
		Coordenadas coordenadas = new Coordenadas(this.getPosicaox()+celulas, this.getPosicaoy()-celulas);
		return coordenadas;
	}
}
