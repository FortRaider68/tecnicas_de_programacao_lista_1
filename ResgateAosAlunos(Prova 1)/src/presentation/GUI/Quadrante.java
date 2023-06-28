package presentation.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import jogo.Jogo;
import jogo.Plano;
import listeners.Celula;

public class Quadrante extends JPanel{
	private int lado;
	private Plano plano;
	protected ArrayList<Celula> celulasListener;
	private Celula celula;//listener
	
	public Quadrante(Celula celula, Plano plano) {
		this.lado = 8;
		this.plano = plano;
		this.celula = celula;
		this.celulasListener = new ArrayList<Celula>();
		this.setLayout(new GridLayout(this.lado,this.lado));
		
		for (int i = this.lado; i > 0 ; i--) {
			for (int j = 0; j < this.lado; j++) {
				int index = i + j * this.lado-1;
				
				Celula celulaListener;
				try {
					celulaListener = this.celula.clone();
				} catch (Exception e) {
					celulaListener = null;
				}

				celulaListener.setCelula(this.plano.getListaCelulas().get(index));
		
				CelulaBotao aux;
				if((i+j) % 2 == 0)
					aux = new CelulaBotao (Color.decode("#FFFFFF"),"");
				else
					aux = new CelulaBotao (Color.decode("#000055"),"");
				
				celulaListener.setBotao(aux);
				aux.addActionListener(celulaListener);
				aux.setEnabled(false);
				this.celulasListener.add(celulaListener);
				this.add(aux);
			}
			
		}
		this.setPreferredSize(new Dimension(450, 380));
	}
	
	public void travarBotoes(boolean estado) {
		for (Celula celula : celulasListener) {
			celula.getBotao().setEnabled(!estado);
		}
	}

	
}
