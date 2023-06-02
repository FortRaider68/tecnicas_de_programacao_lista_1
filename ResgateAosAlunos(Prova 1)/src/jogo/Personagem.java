package jogo;

import presentation.Tela;

public abstract class Personagem {
	private int id;
	private String nome;
	private char simbolo;
	private int posicaox;
	private int posicaoy;
	protected Plano plano;
	private Celula celula;
	private int pontos;
	
	public Personagem(int id, String nome, Plano plano, char simbolo) {
		this.id = id;
		this.nome = nome;
		this.plano = plano;
		this.simbolo = simbolo;
		this.celula = null;
		this.pontos = 0;
	}
	
	public Personagem(String nome,Plano plano, char simbolo,int pontos) {
		this.nome = nome;
		this.plano = plano;
		this.simbolo = simbolo;
		this.pontos = pontos;
		sortearPosicao();
	}

	public char getSimbolo() {
		return simbolo;
	}
	
	public void setPontos(int pontos) {
		this.pontos += pontos;
	}

	public int getPosicaox() {
		return posicaox;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPosicaox(int posicaox) {
		this.posicaox = posicaox;
	}
	
	public int getPosicaoy() {
		return posicaoy;
	}
	
	public void setPosicaoy(int posicaoy) {
		this.posicaoy = posicaoy;
	}

	public int getId() {
		return id;
	}

	public void sortearPosicao() {
		//Não pode "dar spawn" em um celula que já possua outro elemento.
		int x = (int)(Math.random() * plano.getTamanhoX())+1;
		int y = (int)(Math.random() * plano.getTamanhoY())+1;
	
		try {
			Celula aux = this.plano.getCelula(x, y);
			if(aux.getPersonagem().isEmpty()) {
				this.posicaox = x;
				this.posicaoy = y;
				aux.setPersonagem(this);
			}else {
				sortearPosicao();
			}
		} catch (Exception e) {
			sortearPosicao();
		}
	}

	public String getNome() {
		return nome;
	}
	
	public Celula getCelula() {
		return celula;
	}

	public void setCelula(Celula celula) {
		this.celula = celula;
	}
	
}
