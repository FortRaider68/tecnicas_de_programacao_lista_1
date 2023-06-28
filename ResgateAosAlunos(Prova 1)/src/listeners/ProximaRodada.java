package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jogo.Controller;

public class ProximaRodada implements ActionListener {
	private Controller controller;
	
	public ProximaRodada(Controller controller) {
		this.controller = controller;
	}
	
	public void actionPerformed(ActionEvent e) {
		this.controller.proximarodada();
	}
	
}
