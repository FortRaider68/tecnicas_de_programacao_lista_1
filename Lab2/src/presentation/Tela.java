package presentation;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tela extends JFrame {
	
	private Listar lista;
	private JPanel display;
	public Menu menu;
	
	public Tela() {
		super("Laboratório 2");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		
		this.menu = new Menu();
		this.display = new JPanel();
		
		this.add(menu);
		this.add(this.display);

		
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
	}

	public void setDisplay(JPanel display) {
		this.remove(this.display);
		this.display = display;
		this.add(display);
		this.revalidate();
		this.repaint();
		this.pack();
	}
	
	
}
