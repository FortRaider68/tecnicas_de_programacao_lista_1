package jogadores;
import jogo.Coordenadas;
import jogo.Personagem;
import jogo.Plano;

public class Andador extends Robo {

	public Andador(int posicaox, int posicaoy, Plano plano) {
		super(0, "Andador", new Coordenadas(posicaox, posicaoy), plano,'A');
		posicaox+=getId();
		this.setNumeroDePassos(Integer.MAX_VALUE);
		this.setPasso(new Coordenadas(0, 1));
		this.deslocar(new Coordenadas(posicaox, posicaoy));
	}

	public Coordenadas avancar(int celulas) {
		Coordenadas coordenadas = new Coordenadas(this.getPosicaox(), this.getPosicaoy()+celulas);
		return coordenadas;
	}

	public Coordenadas retroceder(int celulas) {
		Coordenadas coordenadas = new Coordenadas(this.getPosicaox(), this.getPosicaoy()-celulas);	
		return coordenadas;
	}

}
