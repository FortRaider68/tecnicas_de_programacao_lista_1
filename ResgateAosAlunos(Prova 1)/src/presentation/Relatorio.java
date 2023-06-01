package presentation;

import java.util.ArrayList;

import jogadores.Robo;
import jogo.Celula;
import jogo.Jogo;
import jogo.Personagem;

public class Relatorio extends Tela {
	private Jogo jogo;
	
	public Relatorio(Jogo jogo) {
		super();
		this.jogo = jogo;
	}
	
	@Override
	public void imprimir() {
		System.out.print("==========================RELÁTORIO==========================\n\n");
		ArrayList<Robo> placarRobosOrdenado = bubbleSort(this.jogo.getRobos());
		
		try {
			for (int i = 0; i < placarRobosOrdenado.size(); i++) {
				Robo robo = placarRobosOrdenado.get(i);
				int nBugs = 0;
				int nAlunos = 0;
				String celulasDetalhes = "";
				String nomeJogador = "";
				
				for (Celula celula : robo.getCelulasMarcadas()) {
					for (Personagem personagem : celula.getPersonagem()) {
						if(personagem.getNome() == "Aluno")
							nAlunos++;
						if(personagem.getNome() == "Bug")
							nBugs++;
					}
					celulasDetalhes+=celula.imprimir();
				}
				if(i == 0) {
					nomeJogador = "("+this.jogo.getNome()+")";
				}
				System.out.print(robo.getNome().toUpperCase()+nomeJogador+" | "+"Pontos:"+robo.getPontos()+" Alunos:"+nAlunos+" Bugs:"+nBugs);
				System.out.println();
				System.out.println(celulasDetalhes);
			}
		} catch (Exception e) {
			return;
		}
	}
	//Para ordenar os robôs por pontuação
	//consideramos que a perfomance disso é desprezível
	private ArrayList<Robo>bubbleSort(ArrayList<Robo> robos){
		ArrayList<Robo> i = robos;
		for (int j = 0; j < robos.size(); j++) {
			for (int k = 0; k < robos.size()-1; k++) {
				if(robos.get(k).getPontos() > robos.get(k+1).getPontos()) {
					Robo aux = robos.get(j);
					i.set(j, robos.get(k));
					i.set(k, aux);
				}
			}
		}
		return i;
	}
	
}
