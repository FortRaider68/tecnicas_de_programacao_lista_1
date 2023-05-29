package robo.jogadores;

import robo.Jogador;
import robo.Personagem;
import robo.Plano;

public abstract class Robo extends Personagem implements Jogador  {
	private int pontos;
	
	public Robo(int id, String nome, int posicaox, int posicaoy, Plano plano, char simbolo) {
		super(id, nome, posicaox, posicaoy, plano, simbolo);
		this.pontos = 0;
	}

	public void deslocar(int x, int y) {
		this.setPosicaox(this.getPosicaox()+x);
		this.setPosicaoy(this.getPosicaoy()+y);
	}

	
}
