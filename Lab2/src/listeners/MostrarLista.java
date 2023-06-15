package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.AlunoController;
import presentation.Listar;
import presentation.Tela;

public class MostrarLista implements ActionListener{
	private Tela tela;
	private AlunoController controller;
	
	public MostrarLista(Tela tela, AlunoController controller) {
		super();
		this.tela = tela;
		this.controller = controller;
		tela.menu.getListar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		tela.setDisplay(new Listar(this.controller.listarAlunos()));
	}

}
