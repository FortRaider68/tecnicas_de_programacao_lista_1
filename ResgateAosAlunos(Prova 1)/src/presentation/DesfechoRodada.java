package presentation;

import jogo.Celula;
import jogo.Jogo;
import jogo.Plano;
import jogo.Rodada;

public class DesfechoRodada extends Tela implements TelaQuadrante{
	private Plano plano;
	private Rodada rodada;
	
	public DesfechoRodada(Plano plano, Rodada rodada) {
		super();
		this.plano = plano;
		this.rodada = rodada;
	}
	
	public void imprimir() {
		limparTela();
		System.out.println("========================DESFECHO=DA=RODADA========================");
		for (int i = plano.getTamanhoY(); i > 0 ; i--) {
			for (int j = 0; j < plano.getTamanhoX(); j++) {
				int index = (i) + j * plano.getTamanhoY()-1;
				Celula aux = plano.getListaCelulas().get(index);
				char simbolo = '.';
				if(aux.isMarcada())
					simbolo = '^';
				System.out.print(" ["+simbolo+"] ");
			}
			this.barraLateral(i);
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.println("Aperte qualquer tecla para Continuar");
		promptString();
	}

	public void barraLateral(int i) {
		int linha = plano.getTamanhoY() - i;
		imprimiAlunosResgatados(linha);
		imprimiBugsOcorridos(linha);
	}
	
	public void imprimiAlunosResgatados(int linha) {
		if(linha == 0) {
			System.out.print("\tAlunos Resgatados:"+this.rodada.getAlunosResgatados());
		}
	}
	
	public void imprimiBugsOcorridos(int linha) {
		if(linha == 1) {
			System.out.print("\tBugs Ocorridos:"+this.rodada.getBugsOcorridos());
		}
	}
}
