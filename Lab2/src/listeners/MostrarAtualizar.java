package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentation.Atualizar;
import presentation.Tela;

public class MostrarAtualizar implements ActionListener{

	private Tela tela;
	
	public MostrarAtualizar(Tela tela) {
		this.tela = tela;
		tela.menu.getAtualizar().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		tela.setDisplay(new Atualizar());
		
	}

}
