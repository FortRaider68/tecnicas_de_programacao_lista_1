package presentation;

import jogo.Celula;
import jogo.Jogo;
import jogo.Personagem;
import jogo.Plano;

public class TelaRodada extends Tela {
	private Plano plano;
	private Jogo jogo;
	private String roboDaVez;
	private boolean revelio; //Apenas para Debug
	
	public TelaRodada(Plano plano, Jogo jogo) {
		super();
		this.plano = plano;
		this.jogo = jogo;
		this.roboDaVez ="";
		this.revelio = true;
	}
	
	public void imprimir() {
		limparTela();
		//Essa parte for um pé no saco de fazer :|
		for (int i = plano.getTamanhoY(); i > 0 ; i--) {
			for (int j = 0; j < plano.getTamanhoX(); j++) {
				int index = (i) + j * plano.getTamanhoY()-1;
				Celula aux = plano.getListaCelulas().get(index);
				char simbolo = simboloCelula(aux);
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
			System.out.print("\tRodada:"+jogo.getRodadaN()+"("+this.roboDaVez.toUpperCase()+")");
		}
	}
	
	private void imprimirMensagem(int linha) {
		if(linha == 1 && Tela.getMessage() != null) {
			System.out.print("\t"+Tela.getMessage().toUpperCase());
			Tela.setMessage("");
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
	
	public char simboloCelula(Celula celula) {
		char simbolo = '.';
		if(celula.isMarcada())
			simbolo = '^';
		if(!celula.getPersonagem().isEmpty()) {
			int nPersonagens = celula.getPersonagem().size();
			Personagem ultimoPersonagem = celula.getPersonagem().get(nPersonagens-1);
			if(ultimoPersonagem.getNome() != "Bug" && ultimoPersonagem.getNome() != "Aluno" || this.revelio && !celula.isMarcada())
				simbolo = ultimoPersonagem.getSimbolo();
		}
		return simbolo;
	}
	
}
