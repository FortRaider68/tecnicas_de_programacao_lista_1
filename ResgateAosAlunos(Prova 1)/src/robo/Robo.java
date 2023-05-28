package robo;

public abstract class Robo {

	private int id;
	private String nome;
	private int posicaox;
	private int posicaoy;
	private Plano plano;
	private int pontos;
	
	public Robo(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		this.id = id;
		this.nome = nome;
		this.posicaox = posicaox;
		this.posicaoy = posicaoy;
		this.plano = plano;
		this.pontos = 0;

		Celula aux = null;
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			aux = plano.listaCelulas.get(i);
			if (aux.posicaoX == posicaox && aux.posicaoY == posicaoy) {
				aux.robo = this;
			}
		}
	}

	public void avancar() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {

			if (plano.listaCelulas.get(i).robo != null) {
				plano.listaCelulas.get(i).robo = null;
				plano.listaCelulas.get(i - 1).robo = this;
			}
		}

	}

	public int retroceder() {
		return posicaox + 1;
	}
}
