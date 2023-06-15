package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.AlunoController;
import presentation.Cadastro;
import presentation.Tela;

public class MostrarCadastro implements ActionListener {
	private Tela tela;
	private AlunoController controller;

	public MostrarCadastro(Tela tela, AlunoController controller) {
		this.tela = tela;
		this.controller = controller;
		this.controller.getTela().menu.getCadastrar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		this.controller.mostrarCadastro();
	}

}
