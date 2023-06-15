package controller;
import listeners.MostrarCadastro;
import listeners.MostrarLista;
import presentation.Tela;

public class Main {

	public static void main(String[] args) {
		Tela tela = new Tela();
		new MostrarCadastro(tela);
		new MostrarLista(tela, new AlunoController());
	}

}
