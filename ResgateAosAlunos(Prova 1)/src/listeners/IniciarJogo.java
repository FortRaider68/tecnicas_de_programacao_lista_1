package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import jogo.Controller;
import presentation.GUI.Tela;

public class IniciarJogo implements ActionListener{
	private Controller controller;
	private Tela tela;
	private JButton botao;
	
	public IniciarJogo(Controller controller, Tela tela) {
		this.controller = controller;
		this.tela = tela;
		this.tela.getPainelSuperior().getJogarBotao().addActionListener(this);;
	}
	
	public void actionPerformed(ActionEvent e) {
		this.controller.setNome();
		this.controller.jogar();
	}

}
