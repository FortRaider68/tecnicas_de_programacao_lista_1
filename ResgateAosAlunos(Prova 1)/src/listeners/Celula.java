package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import jogo.Controller;
import presentation.GUI.CelulaBotao;

public class Celula implements ActionListener, Cloneable {
	private Controller controller;
	private jogo.Celula celula;
	private CelulaBotao botao;
	
	
	public Celula(Controller controller) {
		this.controller = controller;
	}

	public Celula clone() throws CloneNotSupportedException{
		return (Celula)super.clone();
	}
	
	public jogo.Celula getCelula() {
		return celula;
	}

	public void setCelula(jogo.Celula celula) {
		this.celula = celula;
	}
	
	public void setBotao(CelulaBotao botao) {
		this.botao = botao;
	}

	public CelulaBotao getBotao() {
		return botao;
	}

	public void liberarBotao(boolean estado) {
		this.botao.setEnabled(estado);
	}
	
	public void actionPerformed(ActionEvent e) {
		this.controller.posicionarRobo(this);
		
	}
}
