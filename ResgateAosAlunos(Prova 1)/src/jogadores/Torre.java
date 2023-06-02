package jogadores;

import jogo.Coordenadas;
import jogo.Personagem;
import jogo.Plano;

public class Torre extends Robo {
	
	public Torre(int posicaox, int posicaoy, Plano plano) {
		super(2, "Torre", new Coordenadas(posicaox, posicaoy), plano,'T');
		posicaox+=getId();
		this.deslocar(new Coordenadas(posicaox, posicaoy));
	}

	public Coordenadas avancar(int celulas) {
		if(celulas > 2)
			celulas = 2;
		Coordenadas coordenadas = new Coordenadas(this.getPosicaox()+ celulas, this.getPosicaoy());
		return coordenadas;
	}

	public Coordenadas retroceder(int celulas) {
		if(celulas > 2)
			celulas = 2;
		Coordenadas coordenadas = new Coordenadas(this.getPosicaox()-celulas,this.getPosicaoy());
		return coordenadas;
	}
}
