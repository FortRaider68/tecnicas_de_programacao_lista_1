package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jogo.Controller;

public class VerificarListener implements ActionListener {
	private Controller controller;
	
	public VerificarListener(Controller controller) {
		this.controller = controller;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.controller.verificar();
	}

}
