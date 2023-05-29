package robo;
import java.util.ArrayList;

import presentation.*;
import robo.jogadores.*;

public class Jogo {
	private Prompt prompt;
	private Rodada quadranteTela;
	private String nome;
	private Plano plano;
	private int quantidadeBugs;
	private int quantidadeRobos;
	private int quantidadeAlunos;
	private int alunoResgatados;
	private int rodada;
	private boolean exit;
	private ArrayList<Robo> robos;
	
	public Jogo() {
		this.prompt = new Prompt();
		this.plano = new Plano(7, 7);
		this.robos = new ArrayList<Robo>();
		this.quadranteTela = new Rodada(this.plano, this);
		this.quantidadeRobos = 7;
		this.nome = prompt.promptNome();
		setTamanhoPlano(prompt.promptPlanoParametros());
		setQuantidadeBugs(prompt.promptQuantidadeBugs(maximoNumeroNPC()/2));
		setQuantidadeAlunos(prompt.promptQuantidadeAlunos(maximoNumeroNPC()-quantidadeBugs));
		//prompt.fecharEntrada();
		this.rodada = 0;
		this.alunoResgatados = 0;
		this.exit = false;
		spawnRobos();
	}
	
	public void jogar() {
		while(alunoResgatados != quantidadeAlunos) {
			if(exit) {
				prompt.setMessage("Tchau :)");
				prompt.imprimir();
				return;
			}
			rodada();
		}
	}
	
	private void rodada() {
		this.rodada+=1;
		for (int i = 0; i < robos.size();) {
			Robo robo = robos.get(i);
			quadranteTela.setRoboDaVez(robo.getNome());
			String entrada[] = quadranteTela.prompt();
			if(entrada[0].contains("q")) {
				exit = true;
				return;
			}
			if(movimento(robo, entrada))
				i++;
		}
	}
	
	public int getRodada() {
		return rodada;
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
	
	public boolean movimento(Robo robo, String [] tokens) {
		try {
			int acao = Integer.parseInt(tokens[0]);
			int ncelulas = Math.abs(Integer.parseInt(tokens[1]));
			
			if(acao == 1) {//avançar
				robo.avancar(ncelulas);
			}else if(acao == 2) {//retroceder
				robo.retroceder(ncelulas);
			}else {
				quadranteTela.setMessage("Ação invalida.");
				return false;
			}
			return true;
		} catch (Exception e) {
			quadranteTela.setMessage("Comando Invalido.");
		}
		return false;
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
			prompt.setMessage("Entrada Invalida. Usanda as dimensões padrão (7x7).");
			prompt.imprimir();
		}
	} 
	
	private int maximoNumeroNPC() {
		return plano.tamanhoPlano()/4;
	}

	public void setQuantidadeBugs(int quantidadeBugs) {
		if(quantidadeBugs > maximoNumeroNPC()/2) {
			this.quantidadeBugs = maximoNumeroNPC()/2;
			prompt.setMessage("A quantidade de bugs não pode ser maior do que a metade ("+maximoNumeroNPC()/2+") permitidade pelo jogo. Lembre-se que você também precisa de alunos no plano.");
			prompt.imprimir();
			return;
		}
		this.quantidadeBugs = quantidadeBugs;
	}

	public void setQuantidadeAlunos(int quantidadeAlunos) {
		if(quantidadeAlunos > maximoNumeroNPC()-quantidadeBugs) {
			this.quantidadeAlunos = maximoNumeroNPC()-quantidadeBugs;
			prompt.setMessage("A quantidade de alunos será de "+this.quantidadeAlunos);
			prompt.imprimir();
			return;
		}else {
			this.quantidadeAlunos = quantidadeAlunos;
		}
	}
	
	
}
