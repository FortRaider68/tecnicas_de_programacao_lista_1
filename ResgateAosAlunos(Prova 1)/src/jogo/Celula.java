package jogo;

import java.util.ArrayList;

public class Celula {

	private int posicaoX;
	private int posicaoY;
	private int id;
	private Coordenadas coordenadas;
	private ArrayList<Personagem> personagens;
	private boolean marcada;
	
	public Celula(int id, int x , int y) {
		this.posicaoX = x;
		this.posicaoY = y;
		this.coordenadas = new Coordenadas(x, y);
		this.id = id;
		this.personagens = new ArrayList<Personagem>();
	}

	public boolean isMarcada() {
		return marcada;
	}

	public void setMarcada(boolean marcada) {
		this.marcada = marcada;
	}
	
	public String imprimir() {
		return "Celula:  " + id + " x: " + posicaoX + " y: " + posicaoY + "\n";
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}
	
	public Coordenadas getCoordenadas() {
		return coordenadas;
	}
	
	public int getId() {
		return id;
	}

	public ArrayList<Personagem> getPersonagem() {
		return personagens;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagens.add(personagem);
	}
	
	public void removerPersonagem(Personagem personagem) {
		this.personagens.remove(personagem);
	}
	
}
