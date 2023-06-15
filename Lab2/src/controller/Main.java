package controller;
import listeners.*;
import presentation.Tela;

public class Main {

	public static void main(String[] args) {
		Tela tela = new Tela();
		AlunoController controller = new AlunoController(tela);
		new MostrarCadastro(tela,controller);
		new MostrarLista(tela, controller);
		new MostrarAtualizar(tela);
		new MostrarDeletar(tela);
		new Cadastrar(controller);
	}

}
