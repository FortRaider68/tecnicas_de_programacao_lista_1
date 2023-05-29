package robo;

import java.util.ArrayList;

public class Celula {

	private int posicaoX;
	private int posicaoY;
	private int id;
	private ArrayList<Personagem> personagens;	
	private char simbolo;
	
	public Celula(int id, int x , int y) {
		this.posicaoX = x;
		this.posicaoY = y;
		this.id = id;
		this.personagens = new ArrayList<Personagem>();
		this.simbolo = '.';
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
	
	public void atulizarCelula() {
		if(personagens.isEmpty()) {
			this.simbolo = '.';
		}else {
			this.simbolo = this.personagens.get(this.personagens.size()-1).getSimbolo();
		}
	}
}
