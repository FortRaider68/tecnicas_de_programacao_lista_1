package jogo;

import java.util.ArrayList;

import jogadores.Andador;
import jogadores.Bispo;
import jogadores.Cavalo;
import jogadores.Peao;
import jogadores.Rainha;
import jogadores.Rei;
import jogadores.Robo;
import jogadores.Torre;
import presentation.DesfechoRodada;
import presentation.Tela;
import presentation.TelaRodada;

public class Rodada {
	private Jogo jogo;
	private Plano plano;
	private int alunosResgatados;
	private int bugsOcorridos;
	private ArrayList<Celula> celulasAntesDaRodada;
	private DesfechoRodada desfechoRodada;
	private TelaRodada quadranteTela;
	
	public Rodada(Jogo jogo, Plano plano) {
		this.jogo = jogo;
		this.plano = plano;
		this.alunosResgatados = 0;
		this.bugsOcorridos = 0;
		this.desfechoRodada = new DesfechoRodada(this.plano, this);
		this.quadranteTela = new TelaRodada(this.plano, this.jogo);
	}
	
	public void spawnRobosCLI() {
		int gap = (plano.getTamanhoX() - this.jogo.getQuantidadeRobos())/2;
		Robo andador = new Andador(gap, 0, plano);
		Robo peao = new Peao(gap, 0, plano);
		Robo torre = new Torre(gap, 0, plano);
		Robo bispo = new Bispo(gap, 0, plano);
		Robo cavalo = new Cavalo(gap, 0, plano);
		Robo rei = new Rei(gap,0, plano);
		Robo rainha = new Rainha(gap, 0, plano);
		
		this.jogo.getRobos().add(andador);
//		this.jogo.getRobos().add(peao);
//		this.jogo.getRobos().add(torre);
		this.jogo.getRobos().add(bispo);
		this.jogo.getRobos().add(cavalo);
//		this.jogo.getRobos().add(rei);
		this.jogo.getRobos().add(rainha);
	}
	
	public void spawnRobosGUI() {
		int gap = (plano.getTamanhoX() - this.jogo.getQuantidadeRobos())/2;
		Robo andador = new Andador(gap, 1, plano);
		Robo cavalo = new Cavalo(gap, 1, plano);
		Robo rainha = new Rainha(gap, 1, plano);
		
		this.jogo.getRobos().add(andador);
		this.jogo.getRobos().add(cavalo);
		this.jogo.getRobos().add(rainha);
	}
	
	public int getAlunosResgatados() {
		return alunosResgatados;
	}

	public int getBugsOcorridos() {
		return bugsOcorridos;
	}
	
	/*
	 * Para saber quantos Alunos foram resgatados primeiro pegamos 
	 * a quantidade de Células marcadas antes da rodada, e tiramos 
	 * a diferença com as celulas marcadas depois da rodada. Verificamos a
	 * quantidade de alunos e bugs na diferença.
	 */

	public boolean jogar() {
		jogo.setRodadaN(jogo.getRodadaN()+1);
		this.celulasAntesDaRodada = this.plano.getCelulasMarcadas();
		for (int i = 0; i < this.jogo.getRobos().size();) {
			Robo robo = this.jogo.getRobos().get(i);
			quadranteTela.setRoboDaVez(robo.getNome());
			String entrada[] = quadranteTela.prompt();
			if(entrada[0].contains("q")) {
				this.jogo.setExit(true);
				return false;
			}
			Coordenadas coordenadasCelula = new Coordenadas(entrada,robo);
			System.out.println(robo.magnitude(coordenadasCelula));
			if(coordenadasCelula != null && robo.deslocar(coordenadasCelula)) {
				
				robo.passouPelaCelula();
				robo.encontrouNPC();
				i++;
			}	
			if(this.jogo.verificarVitoria())
				return false;
		}
		estadoDesfecho();
		desfechoRodada.imprimir();
		this.alunosResgatados = 0;
		this.bugsOcorridos = 0;
		Tela.setMessage("");
		return true;
	}
	
	private ArrayList<Celula> diferencaEntreCelulas(){
		ArrayList<Celula> diferencaCelulas = new ArrayList<Celula>();
		for (Celula celula : this.plano.getCelulasMarcadas()) {
			if(!this.celulasAntesDaRodada.contains(celula))
				diferencaCelulas.add(celula);
		}
		return diferencaCelulas;
	}
	
	public void estadoDesfecho() {
		ArrayList<Celula> diferencaCelulas = diferencaEntreCelulas();
		for (Celula celula : diferencaCelulas) {
			ArrayList<Personagem> aux = celula.getPersonagem();
			for (Personagem personagem : aux) {
				if(personagem.getNome() == "Aluno")
					this.alunosResgatados++;
				if(personagem.getNome() == "Bug")
					this.bugsOcorridos++;
			}
		}
	}
}
