package robo.npcs;

import robo.Personagem;
import robo.Plano;

public class Bug extends Personagem {
	private int bonificaPontos;
	
	public Bug(Plano plano) {
		super("Bug",plano, 'S');
		this.bonificaPontos = -15;
	}

}
