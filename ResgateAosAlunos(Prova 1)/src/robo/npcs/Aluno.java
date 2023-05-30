package robo.npcs;

import robo.Personagem;
import robo.Plano;

public class Aluno extends Personagem {
	private int bonificaPontos;
	
	public Aluno(Plano plano) {
		super("Aluno",plano, 'B');
		this.bonificaPontos = 10;
	}
}
