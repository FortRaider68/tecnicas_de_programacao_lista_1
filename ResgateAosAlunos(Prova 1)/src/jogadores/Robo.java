package jogadores;

import jogo.Celula;
import jogo.Jogador;
import jogo.Personagem;
import jogo.Plano;
import npcs.Aluno;
import presentation.Tela;

public abstract class Robo extends Personagem implements Jogador  {
	
	public Robo(int id, String nome, int posicaox, int posicaoy, Plano plano, char simbolo) {
		super(id, nome, posicaox, posicaoy, plano, simbolo);
	}

	public void deslocar(int x, int y) {
		this.setPosicaox(this.getPosicaox()+x);
		this.setPosicaoy(this.getPosicaoy()+y);
		encontrouNPC();
		this.getCelula().setMarcada(true);
	}

	
	
	public void encontrouNPC() {
		for (Personagem aux : this.getCelula().getPersonagem()) {
			if(aux.getNome() == "Bug") {
				this.setPontos(aux.getPontos());
				Tela.setMessage("Essa não! Você passou por um Bug.");
			}
			
			if(aux.getNome() == "Aluno") {
				Aluno i = (Aluno)aux;
				if(!i.isResgatado()) {
					i.setResgatado(true);
					this.setPontos(aux.getPontos());
					Tela.setMessage("Isso aí. Resgatamos um aluno.");
				}
			}
		}
	}
}
