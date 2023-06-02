package jogadores;

import jogo.Coordenadas;
import jogo.Personagem;
import jogo.Plano;

public class Cavalo extends Robo {
	
	public Cavalo(int posicaox, int posicaoy, Plano plano) {
		super(4, "Cavalo", new Coordenadas(posicaox, posicaoy), plano,'C');
		posicaox+=getId();
		this.deslocar(new Coordenadas(posicaox, posicaoy));
	}

	public Coordenadas avancar(int celulas) {
		if(celulas > 2)
			celulas = 2;
		Coordenadas coordenadas = new Coordenadas(this.getPosicaox()+celulas,this.getPosicaoy()+celulas);
		return coordenadas;
	}

	public Coordenadas retroceder(int celulas) {
		if(celulas > 2)
			celulas = 2;
		Coordenadas coordenadas = new Coordenadas(this.getPosicaox() -celulas,this.getPosicaoy() -celulas);
		return coordenadas;
	}
}
