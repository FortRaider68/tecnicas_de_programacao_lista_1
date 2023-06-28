package jogo;


import listeners.Sair;
import presentation.GUI.Tela;

public class Main {

	public static void main(String[] args) {

//		Jogo jogo = new Jogo();
//		jogo.jogar();
		Tela tela = new Tela(); 
		new Controller(tela);
	}
	

}
