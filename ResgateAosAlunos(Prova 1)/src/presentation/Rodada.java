package presentation;

import robo.Celula;
import robo.Jogo;
import robo.Plano;

public class Rodada extends Tela {
	protected Plano plano;
	protected Jogo jogo;
	private String roboDaVez;
	
	public Rodada(Plano plano, Jogo jogo) {
		super();
		this.plano = plano;
		this.jogo = jogo;
		this.roboDaVez ="";
	}
	
	public void imprimir() {
		limparTela();
		//Essa parte for um pé no saco de fazer :|
		for (int i = plano.getTamanhoY(); i > 0 ; i--) {
			for (int j = 0; j < plano.getTamanhoX(); j++) {
				int index = (i) + j * plano.getTamanhoY()-1;
				Celula aux = plano.getListaCelulas().get(index);
				char simbolo = aux.getSimbolo();
				System.out.print(" ["+simbolo+"] ");
			}
			this.barraLateral(i);
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.println("(Insira 'q' para sair.)");
		System.out.println("Insira (Ação:n° de passos):");
		
	}

	private void barraLateral(int i) {
		int linha = plano.getTamanhoY() - i;
		imprimirRodada(linha);
		imprimirMensagem(linha);
		imprimirAcoes(linha);
	}
	
	private void imprimirRodada(int linha) {
		if(linha ==0) {
			System.out.print("\tRodada:"+jogo.getRodada()+"("+this.roboDaVez.toUpperCase()+")");
		}
	}
	
	private void imprimirMensagem(int linha) {
		if(linha == 1 && getMessage() != null) {
			System.out.print("\t"+getMessage().toUpperCase());
			Tela.message = "";
		} 
	}
	
	private void imprimirAcoes(int linha) {
		switch (linha) {
		case 4:
			System.out.print("\tAÇÕES:");
			break;
		case 5:
			System.out.print("\t1:Avançar");
			break;
		case 6:
			System.out.print("\t2:Retroceder");
			break;
		default:
			break;
		}
	}
	
	public String [] prompt() {
		imprimir();
		String [] tokens = promptToken(":");
		return tokens;
	}

	public String getRoboDaVez() {
		return roboDaVez;
	}

	public void setRoboDaVez(String roboDaVez) {
		this.roboDaVez = roboDaVez;
	}
	
	
}
