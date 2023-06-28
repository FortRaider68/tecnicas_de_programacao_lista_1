package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jogo.Controller;

public class ListarRelatorios implements ActionListener {
	private Controller controller;
	
	public ListarRelatorios(Controller controller) {
		this.controller = controller;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		this.controller.listarRelatorios();
	}

}
