package presentation.GUI;

import java.awt.Color;

import javax.swing.JButton;

public class CelulaBotao extends JButton{
	private Color cor;
	private Color corMarcada;
	
	public CelulaBotao(Color cor ,String message) {
		super(message);
		this.cor = cor;
		this.setBackground(this.cor);
		this.corMarcada = Color.decode("#ff0000");
	}
	
	public void marcar (boolean estado) {
		if(estado) 
			this.setBackground(this.corMarcada);
		else
			this.setBackground(this.cor);
	}
	
}
