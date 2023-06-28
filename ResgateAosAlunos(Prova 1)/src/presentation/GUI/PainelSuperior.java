package presentation.GUI;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelSuperior extends JPanel {
	private JTextField nomeDoJogadorField;
	private JButton jogarBotao;
	protected JButton relatorioBotao;
	
	public PainelSuperior() {
		this.setLayout(new FlowLayout());
		JLabel nomeDoJogadorLabel = new JLabel("Nome do Jogador:");
		this.nomeDoJogadorField = new JTextField(30);
		this.relatorioBotao = new JButton("Relatório do Jogo");
		this.jogarBotao = new JButton("Jogar");
		
		this.add(nomeDoJogadorLabel);
		this.add(nomeDoJogadorField);
		this.add(jogarBotao);
		this.add(relatorioBotao);
	}
	
	public String getNomeDoJogadorField() {
		return nomeDoJogadorField.getText();
	}
	
	public JButton getJogarBotao() {
		return this.jogarBotao;
	} 
}
