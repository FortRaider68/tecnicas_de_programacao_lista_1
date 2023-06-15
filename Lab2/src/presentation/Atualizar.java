package presentation;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

import controller.Aluno;

public class Atualizar extends JPanel implements Entradas{
	private JTextField matriculaField;
	private JTextField vertenteField;
	
	public Atualizar (listeners.Atualizar atualizaListener) {
		atualizaListener.setAtualizar(this);
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JLabel matriculaLabel = new JLabel("Matrícula:");
		JLabel vertenteLabel = new JLabel("Vertente:");
		
		this.matriculaField = new JTextField(30);
		this.vertenteField = new JTextField(30);

		JButton cadastrar = new JButton("Atualizar");
		cadastrar.addActionListener(atualizaListener);
		
		c.ipady = 10;
		c.ipadx = 50;
		c.anchor = GridBagConstraints.PAGE_START;
		c.insets = new Insets(30, 0, 0, 0);
		this.add(matriculaLabel,c);
		c.gridy = 1;
		this.add(vertenteLabel,c);
		
		
		c.gridx = 1;
		c.ipadx = 0;
		c.weightx = 2;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(30, 0, 10, 0);
		c.anchor = GridBagConstraints.PAGE_END;
		c.gridy = 0;
		c.gridwidth =2;
		this.add(matriculaField,c);
		c.gridy = 1;
		this.add(vertenteField,c);
		
		c.gridy =2;
		c.fill = GridBagConstraints.NONE;
		c.anchor = GridBagConstraints.LAST_LINE_END;
		c.weightx = 0.1;
		c.insets =new Insets(0, 0, 10, 0);
		this.add(cadastrar,c);
	}

	public Aluno getEstado() {
		return new Aluno("", "", this.matriculaField.getText(),this.vertenteField.getText());
	}
}

