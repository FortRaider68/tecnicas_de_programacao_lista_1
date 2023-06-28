package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import presentation.GUI.*;

public class Sair implements ActionListener {
	private Tela tela;
	
	public Sair(Tela tela) {
		this.tela = tela;
	}
	
	public void actionPerformed(ActionEvent e) {
		this.tela.mostrarTelaRelatorio();
		try {
			//Thread.sleep(4000);
		} catch (Exception e2) {
			// TODO: handle exception
		}
		//tela.dispose();
		
	}

}
