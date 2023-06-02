package jogadores;

import java.util.ArrayList;

import jogo.Celula;
import jogo.Coordenadas;
import jogo.Personagem;
import jogo.Plano;
import npcs.Aluno;
import presentation.Tela;

public abstract class Robo extends Personagem implements Jogador  {
	private ArrayList<Celula> celulasMarcadas;
	
	public Robo(int id, String nome, Coordenadas coordenadas, Plano plano, char simbolo) {
		super(id, nome, plano, simbolo);
		this.celulasMarcadas = new ArrayList<Celula>();
		this.deslocar(coordenadas);
	}

	public boolean deslocar(Coordenadas coordenadas) {
		Celula aux = null;
		for (int i = 0; i < this.plano.getListaCelulas().size(); i++) {
			aux = this.plano.getListaCelulas().get(i);
			if (aux.getPosicaoX() == coordenadas.getX()+1 && aux.getPosicaoY() == coordenadas.getY()+1) {
				if(this.getCelula() != null) {
					this.getCelula().removerPersonagem(this);
				}
				aux.setPersonagem(this);	
				this.setCelula(aux);
				this.setPosicaox(coordenadas.getX());
				this.setPosicaoy(coordenadas.getY());
				return true;
			}
		}
		Tela.setMessage("Cuidado! Você está passando dos limites do plano.");
		return false;
	}
	
	public void passouPelaCelula() {
		this.celulasMarcadas.add(this.getCelula());
		this.getCelula().setMarcada(true);
	}
	
	public ArrayList<Celula> getCelulasMarcadas() {
		return celulasMarcadas;
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
