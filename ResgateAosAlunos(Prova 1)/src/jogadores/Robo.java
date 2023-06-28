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
	private Coordenadas passo;
	private int nBugs;
	private int nAlunos;
	private listeners.Celula posFinal;
	private int numeroDePassos;
	
	public Robo(int id, String nome, Coordenadas coordenadas, Plano plano, char simbolo) {
		super(id, nome, plano, simbolo);
		this.celulasMarcadas = new ArrayList<Celula>();
		this.nBugs = 0;
		this.setCoordenadas(coordenadas);
		this.deslocar(coordenadas);
	}

	public int magnitude(Coordenadas destino) {
		int delta_x = destino.getX() - this.getCoordenadas().getX();
		int delta_y = destino.getY() - this.getCoordenadas().getY();
		Coordenadas deslocamento = new Coordenadas(delta_x, delta_y);
		
		try {
			if(this.passo.getX() == 0 && deslocamento.getX() == 0 ) {
				return delta_y/this.passo.getY();
			}else if(this.passo.getY() == 0 && deslocamento.getY() == 0) {
				return delta_x/this.passo.getX();
			}else {
				float tan = delta_y/delta_x;
				float tanPasso = this.passo.getY()/this.passo.getX();
				
				if(tan == tanPasso) {
					double deslocamentoMag = deslocamento.magnitude();
					double passoMag = this.passo.magnitude();
					double deslocamentoTotalMag = deslocamentoMag/passoMag;
					return (int) Math.round( deslocamentoTotalMag);
				}
			}
		} 
		catch (java.lang.ArithmeticException e) {
			return 0;
		}
		
		return 0;
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
	
	public void passouPelaCelula(Celula celula) {
		this.celulasMarcadas.add(celula);
		celula.setMarcada(true);
	}
	
	public ArrayList<Celula> getCelulasMarcadas() {
		return celulasMarcadas;
	}

	public void encontrouNPC() {
		for (Personagem aux : this.getCelula().getPersonagem()) {
			if(aux.getNome() == "Bug") {
				this.setPontos(aux.getPontos());
				Tela.setMessage("Essa não! Você passou por um Bug.");
				this.nBugs++;
			}
			
			if(aux.getNome() == "Aluno") {
				Aluno i = (Aluno)aux;
				if(!i.isResgatado()) {
					i.setResgatado(true);
					this.setPontos(aux.getPontos());
					this.nAlunos++;
					Tela.setMessage("Isso aí. Resgatamos um aluno.");
				}
			}
		}
	}
	
	public void encontrouNPC(Celula celula) {
		for (Personagem aux : celula.getPersonagem()) {
			if(aux.getNome() == "Bug") {
				this.setPontos(aux.getPontos());
				this.nBugs++;
			}
			
			if(aux.getNome() == "Aluno") {
				Aluno i = (Aluno)aux;
				if(!i.isResgatado()) {
					i.setResgatado(true);
					this.setPontos(aux.getPontos());
					this.nAlunos++;
				}
			}
		}
	}

	public void setPasso(Coordenadas passo) {
		this.passo = passo;
	}

	public void setNumeroDePassos(int numeroDePassos) {
		this.numeroDePassos = numeroDePassos;
	}

	public int getNumeroDePassos() {
		return numeroDePassos;
	}

	public  listeners.Celula getPosFinal() {
		return posFinal;
	}

	public void setPosFinal( listeners.Celula posFinal) {
		this.posFinal = posFinal;
	}

	public int getnBugs() {
		return nBugs;
	}

	public int getnAlunos() {
		return nAlunos;
	}
	
	
}
