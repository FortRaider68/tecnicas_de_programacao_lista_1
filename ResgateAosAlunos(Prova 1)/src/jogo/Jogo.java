package jogo;
import java.util.ArrayList;

import jogadores.*;
import npcs.Aluno;
import npcs.Bug;
import presentation.*;

public class Jogo {
	private Prompt prompt;
	private Relatorio relatorio;
	private String nome;
	private Plano plano;
	private Rodada rodada;
	private int quantidadeRobos;
	private int alunoResgatados;
	private int rodadaN;
	private boolean exit;
	private ArrayList<Robo> robos;
	
	public Jogo() {
		this.prompt = new Prompt();
		this.relatorio = new Relatorio(this);
		this.plano = new Plano(7, 7);
		this.robos = new ArrayList<Robo>();
		this.rodada = new Rodada(this, plano);
		this.quantidadeRobos = 7;
		this.nome = prompt.promptNome();
		setTamanhoPlano(prompt.promptPlanoParametros());
		this.spawnRobos();
		int nBugs = parserQuantidadeBugs(prompt.promptQuantidadeBugs(maximoNumeroNPC()/2));
		int nAlunos = parserQuantidadeAlunos(prompt.promptQuantidadeAlunos(maximoNumeroNPC()-nBugs),nBugs);
		this.plano.instanciarNPCs(nAlunos,nBugs);
		this.rodadaN = 0;
		this.alunoResgatados = 0;
		this.exit = false;
	}
	
	public void jogar() {
		boolean parada = true;
		while(parada) {
			parada = rodada.jogar();
			if(exit) {
				this.relatorio.imprimir();
				Tela.setMessage("Tchau :)");
				prompt.imprimir();
				return;
			}	
		}	
	}
	
	public String getNome() {
		return nome;
	}

	public void setRodadaN(int rodadaN) {
		this.rodadaN = rodadaN;
	}
	
	public int getRodadaN() {
		return rodadaN;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}
	
	public int alunosResgatados() {
		int aux = 0;
		for (Celula celula : this.plano.getCelulasMarcadas()) {
			for(Personagem personagem : celula.getPersonagem()) {
				if(personagem.getNome() == "Aluno")
					aux++;
			}
		}
		return aux;
	}
	
	public boolean verificarVitoria() {
		if(this.alunosResgatados() == this.plano.getNAlunos()) {
			Tela.setMessage("VOCÊ GANHOU!!!");
			prompt.imprimir();
			this.relatorio.imprimir();
			return true;
		}
		return false;
	}

	public void spawnRobos() {
		int gap = (plano.getTamanhoX() - this.quantidadeRobos)/2;
		Robo andador = new Andador(gap, 0, plano);
		Robo peao = new Peao(gap, 0, plano);
		Robo torre = new Torre(gap, 0, plano);
		Robo bispo = new Bispo(gap, 0, plano);
		Robo cavalo = new Cavalo(gap, 0, plano);
		Robo rei = new Rei(gap,0, plano);
		Robo rainha = new Rainha(gap, 0, plano);
		
		robos.add(andador);
		robos.add(peao);
		robos.add(torre);
		robos.add(bispo);
		robos.add(cavalo);
		robos.add(rei);
		robos.add(rainha);
	}

	public ArrayList<Robo> getRobos() {
		return robos;
	}

	public Coordenadas parserMovimento(Robo robo, String [] tokens) {
		try {
			int acao = Integer.parseInt(tokens[0]);
			int ncelulas = Math.abs(Integer.parseInt(tokens[1]));
			
			if(acao == 1) {//avançar
				return robo.avancar(ncelulas);
			}else if(acao == 2) {//retroceder
				return robo.retroceder(ncelulas);
			}else {
				Tela.setMessage("Ação invalida.");
				return null;
			}
		} catch (Exception e) {
			Tela.setMessage("Comando Invalido.");
		}
		return null;
	}
	
	public void setTamanhoPlano(String[] dimensoes) {
		try {
			int x = Integer.parseInt(dimensoes[0]);
			int y = Integer.parseInt(dimensoes[1]);
			if(x < 7 || y < 7) {
				x = 7;
				y = 7;
			}
			plano.setPlanoDimensoes(x, y);
		} catch (Exception e) {
			Tela.setMessage("Entrada Invalida. Usando as dimensões padrão (7x7).");
			prompt.imprimir();
		}
	} 
	
	private int maximoNumeroNPC() {
		return plano.tamanhoPlano()/4;
	}

	public int parserQuantidadeBugs(int quantidadeBugs) {
		if(quantidadeBugs > maximoNumeroNPC()/2) {
			Tela.setMessage("A quantidade de bugs não pode ser maior do que a metade ("+maximoNumeroNPC()/2+") permitidade pelo jogo. Lembre-se que você também precisa de alunos no plano.");
			prompt.imprimir();
			return maximoNumeroNPC()/2;
		}
		return quantidadeBugs;
	}

	public int parserQuantidadeAlunos(int quantidadeAlunos, int nBugs) {
		int maximoNAlunos = maximoNumeroNPC()-nBugs;
		if(quantidadeAlunos > maximoNAlunos) {
			Tela.setMessage("A quantidade de alunos será de "+maximoNAlunos);
			prompt.imprimir();
			return maximoNAlunos;
		}
		return quantidadeAlunos;
	}
	
	
}
