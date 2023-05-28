package robo;

public class Celula {

	private int posicaoX;
	private int posicaoY;
	private int id;
	private Robo robo;	
	private char simbolo;
	
	public Celula(int id, int x , int y) {
		this.posicaoX = x;
		this.posicaoY = y;
		this.id = id;
		this.robo =null;
		this.simbolo = '.';
	}
	
	public char getSimbolo() {
		return this.simbolo;
	}
	
	public String imprimir() {
		return "Celula:  " + id + " x: " + posicaoX + " y: " + posicaoY;
	}
}
