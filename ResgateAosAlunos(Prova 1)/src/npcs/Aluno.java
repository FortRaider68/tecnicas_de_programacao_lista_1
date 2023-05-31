package npcs;

import jogo.Personagem;
import jogo.Plano;

public class Aluno extends Personagem {
	private boolean resgatado;
	
	public Aluno(Plano plano) {
		super("Aluno",plano, 'U',10);
		this.resgatado = false;
	}

	public boolean isResgatado() {
		return resgatado;
	}

	public void setResgatado(boolean resgatado) {
		this.resgatado = resgatado;
	}
	
	
}
