package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jogadores.Robo;
import jogo.Controller;

public class SelecionarRobo implements ActionListener, Cloneable {
	private Robo robo;
	private Controller controller;
	
	public SelecionarRobo(Controller controller) {
		this.controller = controller;
	}
	
	public SelecionarRobo clone() throws CloneNotSupportedException{
		return (SelecionarRobo) super.clone();
	}
	
	public Robo getRobo() {
		return robo;
	}

	public void setRobo(Robo robo) {
		this.robo = robo;
	}

	public void actionPerformed(ActionEvent e) {
		this.controller.setRoboSelecionado(this.robo);
		
	}
}
