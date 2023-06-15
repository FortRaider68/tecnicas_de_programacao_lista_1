package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.AlunoController;
import presentation.Cadastro;
import presentation.Tela;

public class MostrarCadastro implements ActionListener {
	private Tela tela;

	public MostrarCadastro(Tela tela) {
		super();
		this.tela = tela;
		tela.menu.getCadastrar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		tela.setDisplay(new Cadastro());
	}

}
