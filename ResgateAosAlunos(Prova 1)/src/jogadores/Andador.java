package jogadores;
import jogo.Jogador;
import jogo.Personagem;
import jogo.Plano;

public class Andador extends Robo {

	public Andador(int posicaox, int posicaoy, Plano plano) {
		super(0, "Andador", posicaox, posicaoy, plano,'A');
		posicaox+=getId();
		this.setPosicaox(posicaox);
	}

	public void avancar(int celulas) {
		this.deslocar(0, celulas);
	}

	public void retroceder(int celulas) {
		this.deslocar(0, -celulas);	
	}

}
