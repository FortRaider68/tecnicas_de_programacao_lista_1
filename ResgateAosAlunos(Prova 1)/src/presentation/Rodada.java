package presentation;

import robo.Jogo;
import robo.Plano;

public class Rodada extends Tela {
	Plano plano;
	Jogo jogo;
	
	public Rodada(Plano plano, Jogo jogo) {
		this.plano = plano;
		this.jogo = jogo;
	}
	
	private void imprimirTela() {
		limparTela();
		for (int i = plano.getTamanhoY(); i > 0 ; i--) {
			for (int j = 0; j < plano.getTamanhoX(); j++) {
				char simbolo = plano.getListaCelulas().get(i*(plano.getTamanhoY()-1)+j).getSimbolo();
				System.out.print(" ["+simbolo+"] ");
			}
			
			barraLateral(i);
			System.out.print("\n");
		}
		
		System.out.println("(Insira 'q' para sair.)");
		System.out.println("Insira (Ação:n° de passos):");
		
	}

	private void barraLateral(int i) {
		int linha = plano.getTamanhoY() - i;
		imprimirRodada(linha);
		imprimirRoboNome(linha);
		imprimirMensagem(linha);
		imprimirAcoes(linha);
	}
	
	private void imprimirRodada(int linha) {
		if(linha ==0) {
			System.out.print("\tRodada:"+jogo.getRodada());
		}
	}
	
	private void imprimirRoboNome(int linha) {
		if(linha ==1) {
			System.out.print("\tRobô:"+"ANDADOR");
		}
	}
	
	private void imprimirMensagem(int linha) {
		if(linha == 2) {
			System.out.print("\tMensagem: "+"Oi mãe :)");
		} 
	}
	
	private void imprimirAcoes(int linha) {
		switch (linha) {
		case 3:
			System.out.print("\tAÇÕES:");
			break;
		case 4:
			System.out.print("\t1:Avançar");
			break;
		case 5:
			System.out.print("\t2:Retroceder");
			break;
		default:
			break;
		}
	}
	
	@Override
	public void imprimi() {
		imprimirTela();
		
	}
}
