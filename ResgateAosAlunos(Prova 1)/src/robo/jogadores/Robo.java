package robo.jogadores;

import presentation.Tela;
import robo.Jogador;
import robo.Personagem;
import robo.Plano;

public abstract class Robo extends Personagem implements Jogador  {
	
	public Robo(int id, String nome, int posicaox, int posicaoy, Plano plano, char simbolo) {
		super(id, nome, posicaox, posicaoy, plano, simbolo);
	}

	public void deslocar(int x, int y) {
		this.setPosicaox(this.getPosicaox()+x);
		this.setPosicaoy(this.getPosicaoy()+y);
		encontrouNPC();
	}

	
	
	public void encontrouNPC() {
		for (Personagem aux : this.getCelula().getPersonagem()) {
			if(aux.getNome() == "Bug") {
				this.setPontos(aux.getPontos());
				Tela.message = "Essa não! Você passou por um Bug.";
			}
			
			if(aux.getNome() == "Aluno") {
				this.setPontos(aux.getPontos());
				Tela.message = "Isso aí. Resgatamos um aluno.";
			}
		}
	}
}
