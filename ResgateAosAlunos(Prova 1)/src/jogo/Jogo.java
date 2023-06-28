package jogo;
import java.util.ArrayList;

import jogadores.*;
import npcs.Aluno;
import npcs.Bug;
import presentation.*;

public class Jogo {
	private Prompt prompt;
	private presentation.GUI.Tela tela;
	private String nome;
	private Plano plano;
	private Rodada rodada;
	private int quantidadeRobos;
	private int quantidadeAlunos;
	private int quantidadeBugs;
	private int alunoResgatados;
	private int rodadaN;
	private boolean exit;
	private ArrayList<Robo> robos;
	
	public Jogo() {
		this.prompt = new Prompt();
		this.nome = prompt.promptNome();
		this.plano = new Plano(prompt.promptPlanoParametros(),prompt);
		this.robos = new ArrayList<Robo>();
		this.rodada = new Rodada(this, plano);
		this.quantidadeRobos = 7;
		this.rodada.spawnRobosCLI();
		this.setQuantidadeBugs(prompt.promptQuantidadeBugs(maximoNumeroNPC()/2));
		this.setQuantidadeAlunos(prompt.promptQuantidadeAlunos(maximoNumeroNPC()-this.quantidadeBugs));
		this.plano.instanciarNPCs(this.quantidadeAlunos,this.quantidadeBugs);
		this.rodadaN = 0;
		this.alunoResgatados = 0;
		this.exit = false;
	}
	
	public Jogo(presentation.GUI.Tela tela) {
		this.tela = tela;
		this.nome = "Sem Nome";
		this.rodada = new Rodada(this, plano);
		this.plano = new Plano(8, 8);
		this.robos = new ArrayList<Robo>();
		this.quantidadeRobos = 3;
		this.setQuantidadeBugs(maximoNumeroNPC()/2);
		this.setQuantidadeAlunos(maximoNumeroNPC()/2);
		this.rodada = new Rodada(this, plano);
		this.rodada.spawnRobosGUI();
		this.plano.instanciarNPCs(maximoNumeroNPC()/2, maximoNumeroNPC()/2);
		this.rodadaN = 0;
		this.alunoResgatados = 0;
		this.exit = false;
	}


	public void jogar() {
		boolean parada = true;
		while(parada) {
			parada = rodada.jogar();
			if(exit) {
				Tela.setMessage("Tchau :)");
				prompt.imprimir();
				return;
			}	
		}	
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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
			return true;
		}
		return false;
	}


	public ArrayList<Robo> getRobos() {
		return robos;
	}
	
	private int maximoNumeroNPC() {
		return plano.tamanhoPlano()/4;
	}

	public void setQuantidadeAlunos(int quantidadeAlunos) {
		int maximoNAlunos = maximoNumeroNPC()-this.quantidadeBugs;
		if(quantidadeAlunos > maximoNAlunos) {
			Tela.setMessage("A quantidade de alunos será de "+maximoNAlunos);
			prompt.imprimir();
			this.quantidadeAlunos = maximoNAlunos;
		}else {
			this.quantidadeAlunos = quantidadeAlunos;
		}
	}

	public void setQuantidadeBugs(int quantidadeBugs) {
		if(quantidadeBugs > maximoNumeroNPC()/2) {
			Tela.setMessage("A quantidade de bugs não pode ser maior do que a metade ("+maximoNumeroNPC()/2+") permitidade pelo jogo. Lembre-se que você também precisa de alunos no plano.");
			prompt.imprimir();
			this.quantidadeBugs = maximoNumeroNPC()/2;
		}else {
			this.quantidadeBugs = quantidadeBugs;
		}
	}

	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public int getQuantidadeBugs() {
		return quantidadeBugs;
	}

	public int getQuantidadeRobos() {
		return quantidadeRobos;
	}

	public Plano getPlano() {
		return plano;
	}
	
	
	
}
