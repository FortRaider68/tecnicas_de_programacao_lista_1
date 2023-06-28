package jogo;

import jogadores.Robo;
import presentation.Tela;

public class Coordenadas {
	private int X;
	private int Y;
	
	public Coordenadas(int x, int y) {
		super();
		X = x;
		Y = y;
	}
	
	public Coordenadas(String []tokensEntrada, Robo robo) {
		this.X = 0;
		this.Y = 0;
		Coordenadas coordenadas = new Coordenadas(X, Y);
		try {
			int acao = Integer.parseInt(tokensEntrada[0]);
			int ncelulas = Math.abs(Integer.parseInt(tokensEntrada[1]));
			
			if(acao == 1) {//avançar
				coordenadas = robo.avancar(ncelulas);
			}else if(acao == 2) {//retroceder
				coordenadas = robo.retroceder(ncelulas);
			}else {
				Tela.setMessage("Ação invalida.");
			}
		} catch (Exception e) {
			Tela.setMessage("Comando Invalido.");
		}
		this.X = coordenadas.getX();
		this.Y = coordenadas.getY();
	}
	
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	
	public double magnitude() {
		double magnitude = Math.floor(Math.pow(Math.round(Math.pow(this.X,2)+Math.pow(this.Y,2)),0.5));
		return magnitude;
	}
}
