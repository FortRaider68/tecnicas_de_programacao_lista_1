package presentation;

import robo.Jogo;
import robo.Plano;

public class DesfechoRodada extends Rodada{
	
	public DesfechoRodada(Plano plano, Jogo jogo) {
		super(plano, jogo);
		// TODO Auto-generated constructor stub
	}
	
	public void imprimir() {
		super.imprimir();
	}

	public void barraLateral(int i) {
		imprimiAlunosResgatados(i);
	}
	
	public void imprimiAlunosResgatados(int linha) {
		if(linha == 1) {
			System.out.print("Alunos Restantes:"+(this.jogo.getQuantidadeAlunos()-this.plano.quantidadeAlunos()));
		}
	}
}
