package jogadores;

import jogo.Coordenadas;
import jogo.Personagem;
import jogo.Plano;

public class Rainha extends Robo {
	public Rainha(int posicaox, int posicaoy, Plano plano) {
		super(6, "Rainha", new Coordenadas(posicaox, posicaoy), plano,'Q');
		posicaox+=getId();
		this.deslocar(new Coordenadas(posicaox, posicaoy));
	}
	
	public Coordenadas avancar(int celulas) {
		if(celulas > 4)
			celulas = 4;
		Coordenadas coordenadas = new Coordenadas(this.getPosicaox() - celulas,this.getPosicaoy() + celulas);
		return coordenadas;
	}

	public Coordenadas retroceder(int celulas) {
		if(celulas > 4)
			celulas = 4;
		Coordenadas coordenadas = new Coordenadas(this.getPosicaox() + celulas,this.getPosicaoy() - celulas);
		return coordenadas;
	}
}
