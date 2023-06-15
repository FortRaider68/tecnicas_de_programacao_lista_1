package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.AlunoController;
import presentation.Atualizar;
import presentation.Tela;

public class MostrarAtualizar implements ActionListener{
	private AlunoController controller;
	private Tela tela;
	
	public MostrarAtualizar(Tela tela, AlunoController controller) {
		this.controller = controller;
		this.tela = tela;
		this.tela.menu.getAtualizar().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		this.controller.mostrarAtualiza();
		
	}

}
