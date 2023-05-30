package robo;

import java.util.ArrayList;

public class Celula {

	private int posicaoX;
	private int posicaoY;
	private int id;
	private ArrayList<Personagem> personagens;
	private boolean marcada;
	private char simbolo;
	
	public Celula(int id, int x , int y) {
		this.posicaoX = x;
		this.posicaoY = y;
		this.id = id;
		this.personagens = new ArrayList<Personagem>();
		this.simbolo = '.';
	}
	
	public boolean isMarcada() {
		return marcada;
	}

	public void setMarcada(boolean marcada) {
		this.marcada = marcada;
	}

	public char getSimbolo() {
		return this.simbolo;
	}
	
	public String imprimir() {
		return "Celula:  " + id + " x: " + posicaoX + " y: " + posicaoY;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public ArrayList<Personagem> getPersonagem() {
		return personagens;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagens.add(personagem);
		this.atulizarCelula();
	}
	
	public void removerPersonagem(Personagem personagem) {
		this.personagens.remove(personagem);
		this.atulizarCelula();
	}
	
	public boolean temAluno() {
		if(!this.personagens.isEmpty()) {
			for (Personagem personagem : personagens) {
				if(personagem.getNome() == "Aluno")
					return true;
			}
		}
		return false;
	}
	
	public void atulizarCelula() {		
		if(!this.personagens.isEmpty()) {
			Personagem aux = this.personagens.get(this.personagens.size()-1);
			if(aux.getNome() != "Bug" && aux.getNome() != "Aluno")
				this.simbolo = aux.getSimbolo();
		}else {
			this.simbolo = '.';
			if(marcada)
				this.simbolo = '^';
		}
	}
}
