package robo;

public abstract class Personagem {
	private int id;
	private String nome;
	private char simbolo;
	private int posicaox;
	private int posicaoy;
	private Plano plano;
	private Celula celula;
	
	public Personagem(int id, String nome, int posicaox, int posicaoy, Plano plano, char simbolo) {
		this.id = id;
		this.nome = nome;
		this.posicaox = posicaox;
		this.posicaoy = posicaoy;
		this.plano = plano;
		this.simbolo = simbolo;
		this.celula = null;
		
		setPosicao();
	}
	
	public Personagem(String nome,Plano plano, char simbolo) {
		this.nome = nome;
		this.plano = plano;
		this.simbolo = simbolo;
		//sortearPosicao();
	}

	public char getSimbolo() {
		return simbolo;
	}

	public int getPosicaox() {
		return posicaox;
	}
	
	private void setPosicao() {
		Celula aux = null;
		for (int i = 0; i < plano.getListaCelulas().size(); i++) {
			aux = plano.getListaCelulas().get(i);
			if (aux.getPosicaoX() == this.posicaox+1 && aux.getPosicaoY() == this.posicaoy+1) {
				if(this.celula != null) {
					this.celula.removerPersonagem(this);
				}
				aux.setPersonagem(this);	
				this.celula = aux;
				return;
			}
		}
	}

	public void setPosicaox(int posicaox) {
		this.posicaox = posicaox;
		this.setPosicao();
	}

	public int getPosicaoy() {
		return posicaoy;
	}
	
	public void setPosicaoy(int posicaoy) {
		this.posicaoy = posicaoy;
		this.setPosicao();
	}

	public int getId() {
		return id;
	}

	public void sortearPosicao() {
		//Não pode "dar spawn" em um celula que já possua outro elemento.
		int x = (int)(Math.random() * (plano.getTamanhoX()-1));
		int y = (int)(Math.random() * (plano.getTamanhoY()-1));
		int i = y * plano.getTamanhoY() + x;
		Celula aux = plano.getListaCelulas().get(i);
		if(aux.getPersonagem() == null) {
			this.posicaox = x;
			this.posicaoy = y;
			aux.setPersonagem(this);
		}else {
			sortearPosicao();
		}
	}

	public String getNome() {
		return nome;
	}
	
}
