package questao17;

import java.util.Scanner;

public class Velha {
	private int lado = 3;
	private char [][] grade = new char[lado][lado];
	private char [] estado = {' ','X','O'};
	
	public Velha() {
		for (int i = 0; i < 9; i++) {
			int linha = i / 3;
			int coluna = i % 3;
			grade[linha][coluna] = ' ';
		}
	}
	
	public void mostrarGrade() {
		for (int i = 0; i < 9; i++) {
			int linha = i / 3;
			int coluna = i % 3;
			System.out.printf(" |%c| ",grade[linha][coluna]);
			if(coluna == 2 && linha < lado-1)
				System.out.printf("\n----------------\n");
		}
		System.out.println();
	}
	
	public void jogar() {
		int jogada = 0;
		Scanner entrada = new Scanner(System.in);
		char simboloDaVez = ' ';
		while(!deuVelha()) {
			if(jogada % 2 == 0) {
				System.out.println("Player 1 (O):");
				simboloDaVez = estado[2];
			}
			if(jogada % 2 == 1) {
				System.out.println("Player 2 (X):");
				simboloDaVez = estado[1];
			}
			mostrarGrade();
			
			String inputString = entrada.nextLine();
			String[] inputArgs = inputString.split("-");

			try {
				int y = (Integer.parseInt(inputArgs[1])-1);
				int x = Integer.parseInt(inputArgs[0])-1;
				if(grade[y][x] == ' ') {
					grade[y][x] = simboloDaVez;
					jogada++;
					if(verificaGanhou(simboloDaVez)) {
						mostrarGrade();
						System.out.println(simboloDaVez + " Ganhou o jogo!");
						return;
					}
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Essa posição não existe na grade.");
			}
		}
		entrada.close();
		System.out.println("Deu velha.");
	}
	
	public void porX(int x, int y) {
		porSimbolo('X',x,y);
	}
	
	public void porY(int x, int y) {
		porSimbolo('O',x,y);
	}
	
	public void porSimbolo(char simb, int x, int y) {
		try {
			if(grade[x][y] == ' ') {
				grade[x][y] = simb;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Essa posição não existe");
		}
	}
		
	public boolean deuVelha() {
		boolean preenchido = true;
		for (int i = 0; i < lado * lado; i++) {
			int linha = i / 3;
			int coluna = i % 3;
			if(grade[linha][coluna]==' ')
				preenchido = false;
		}
		return preenchido;
	}
	
	public boolean verificaGanhou(char simbolo) {
		int repeticoes = 0;
		//linha
		for (int i = 0; i < lado*lado; i++) {
			int y = i / 3;
			int x = i % 3;
			
			if(y > (i-1)/3)
				repeticoes = 0;
			
			if(grade[y][x] == simbolo)
				repeticoes++;
			
			if(repeticoes == 3)
				return true;
		}
		
		repeticoes = 0;
		//coluna
		for (int i = 0; i < lado*lado; i++) {
			int y = i / lado;
			int x = i % lado;
			
			if(x == 0 ) 
				repeticoes = 0;
			
			if(grade[x][y] == simbolo)
				repeticoes++;
			
			if(repeticoes == 3)
				return true;
		}
		repeticoes = 0;
		//diag
		for (int i = 0; i < lado; i++) {
			int y = i;
			int x = i;
			if(grade[y][x] == simbolo)
				repeticoes++;
			
			if(repeticoes == 3)
				return true;
		}
		repeticoes = 0;
		//antidiag
		for (int i = 0; i < lado; i++) {
			int y = i;
			int x = lado - 1 -i;
			if(grade[y][x] == simbolo) 
				repeticoes++;
			
			if(repeticoes == 3)
				return true;
		}
		return false;
	}
}
