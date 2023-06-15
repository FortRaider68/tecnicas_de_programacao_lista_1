package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentation.Deletar;
import presentation.Tela;

public class MostrarDeletar implements ActionListener {

	private Tela tela;
	
	public MostrarDeletar(Tela tela) {
		this.tela = tela;
		tela.menu.getDeletar().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		tela.setDisplay(new Deletar());
		
	}

}
