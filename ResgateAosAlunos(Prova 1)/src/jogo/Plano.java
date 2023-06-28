package jogo;

import java.util.ArrayList;

import jogadores.Robo;
import npcs.Aluno;
import npcs.Bug;
import presentation.Prompt;
import presentation.Tela;

public class Plano {

	private ArrayList<Celula> listaCelulas;
	private int tamanhoX;
	private int tamanhoY;

	public Plano(int tamanhoX, int tamanhoY) {
		this.setPlanoDimensoes(tamanhoX, tamanhoY);
		this.tamanhoX = tamanhoX;
		this.tamanhoY = tamanhoY;
	}
	
	public Plano(String[] dimensoes, Prompt prompt) {
		try {
			int x = Integer.parseInt(dimensoes[0]);
			int y = Integer.parseInt(dimensoes[1]);
			if(x < 7 || y < 7) {
				x = 7;
				y = 7;
			}
			this.setPlanoDimensoes(x, y);
			this.tamanhoX = x;
			this.tamanhoY = y;
		} catch (Exception e) {
			Tela.setMessage("Entrada Invalida. Usando as dimensões padrão (7x7).");
			prompt.imprimir();
		}
		
	}
	
	public void instanciarNPCs(int nAlunos, int nBugs) {
		for (int i = 0; i < nBugs; i++) {
			new Bug(this);
		}
		for (int i = 0; i < nAlunos; i++) {
			new Aluno(this);
		}
	}
	
	public int getNAlunos() {
		int i = 0;
		for (Celula celula : this.listaCelulas) {
			for(Personagem personagem: celula.getPersonagem()) {
				if(personagem.getNome() == "Aluno")
					i++;
			}
		}
		return i;
	}
	
	public ArrayList<Celula> getCelulasMarcadas() {
		ArrayList<Celula> aux = new ArrayList<Celula>();
		for (Celula celula : this.listaCelulas) {
			if(celula.isMarcada())
				aux.add(celula);
		}
		return aux;
	}
	
	public int getNBugs() {
		int i = 0;
		for (Celula celula : this.listaCelulas) {
			for(Personagem personagem: celula.getPersonagem()) {
				if(personagem.getNome() == "Bug")
					i++;
			}
		}
		return i;
	}
	
	public void setPlanoDimensoes(int tamanhoX, int tamanhoY) {
		listaCelulas = new ArrayList<Celula>();
		this.tamanhoX = tamanhoX;
		this.tamanhoY = tamanhoY;
		
		int contador = 1;
		for (int i = 1; i <= tamanhoX; i++) {
			for (int j = 1; j <= tamanhoY; j++) {
				Celula celula = new Celula(contador, i, j);
				listaCelulas.add(celula);
				contador++;
			}
		}
	}
	
	public Celula getCelula(int id) {
		for (int i = 0; i < listaCelulas.size(); i++) {
			Celula aux = listaCelulas.get(i);
			if(aux.getId() == id)
				return aux;
		}
		return null;
	}
	
	public Celula getCelula(int x, int y) {
		for (int i = 0; i < listaCelulas.size(); i++) {
			Celula aux = listaCelulas.get(i);
			if(aux.getPosicaoX() == x && aux.getPosicaoY() == y)
				return aux;
		}
		return null;
	}
	
	public Celula getCelula(Coordenadas coordenadas) {
		int x = coordenadas.getX();
		int y = coordenadas.getY();
		for (int i = 0; i < listaCelulas.size(); i++) {
			Celula aux = listaCelulas.get(i);
			if(aux.getPosicaoX() == x && aux.getPosicaoY() == y)
				return aux;
		}
		Tela.setMessage("Está se movendo para uma área fora do plano. Cuidado!");
		return null;
	}
	
	public boolean verificarSeTemAlguem(Personagem personagem,int x, int y) {
		for (int i = 0; i < listaCelulas.size(); i++) {
			Celula aux = listaCelulas.get(i);
			if(aux.getPosicaoX() == x && aux.getPosicaoY() == y && aux.getPersonagem().contains(personagem))
				return true;
		}
		return false;
	}


	public Celula retornarCelula(int x, int y) {

		for (int i = 0; i < listaCelulas.size(); i++) {
			if (listaCelulas.get(i).getPosicaoX() == x && listaCelulas.get(i).getPosicaoY() == y) {
				return listaCelulas.get(i);
			}
		}
		return null;
	}

	public void retornarCelulas() {
		for (int i = 0; i < listaCelulas.size(); i++) {
			System.out.println(listaCelulas.get(i).imprimir());
		}
	}
	
	public int tamanhoPlano() {
		return listaCelulas.size();
	}

	public int getTamanhoX() {
		return tamanhoX;
	}

	public int getTamanhoY() {
		return tamanhoY;
	}

	public ArrayList<Celula> getListaCelulas() {
		return listaCelulas;
	}
}
