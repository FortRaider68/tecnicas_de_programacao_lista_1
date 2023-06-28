package jogadores;

import jogo.Coordenadas;
import jogo.Personagem;
import jogo.Plano;

public class Cavalo extends Robo {
	
	public Cavalo(int posicaox, int posicaoy, Plano plano) {
		super(1, "Cavalo", new Coordenadas(posicaox, posicaoy), plano,'C');
		posicaox+=getId();
		this.setNumeroDePassos(2);
		this.setPasso(new Coordenadas(1, 1));
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
