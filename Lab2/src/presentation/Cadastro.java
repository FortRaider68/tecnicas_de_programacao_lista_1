package presentation;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

import controller.Aluno;
import controller.AlunoController;
import listeners.Cadastrar;

public class Cadastro extends JPanel implements Entradas{
	
	private JTextField nomeField;
	private JTextField cpfField;
	private JTextField matriculaField;
	private JTextField vertenteField;
	
	public Cadastro (Cadastrar cadastroListener) {
		cadastroListener.setCadastro(this);
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JLabel nomeLabel = new JLabel("Nome:");
		JLabel cpfLabel = new JLabel("CPF:");
		JLabel matriculaLabel = new JLabel("Matrícula:");
		JLabel vertenteLabel = new JLabel("Vertente:");
		
		this.nomeField = new JTextField(30);
		this.cpfField = new JTextField(30);
		this.matriculaField = new JTextField(30);
		this.vertenteField = new JTextField(30);

		JButton cadastrar = new JButton("Cadastrar");
		cadastrar.addActionListener(cadastroListener);
		
		c.ipady = 10;
		c.ipadx = 50;
		c.anchor = GridBagConstraints.PAGE_START;
		c.insets = new Insets(30, 0, 0, 0);
		this.add(nomeLabel,c);
		c.gridy = 1;
		this.add(cpfLabel,c);
		c.gridy = 2;
		this.add(matriculaLabel,c);
		c.gridy = 3;
		this.add(vertenteLabel,c);
		
		c.gridx = 1;
		c.ipadx = 0;
		c.weightx = 2;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(30, 0, 10, 0);
		c.anchor = GridBagConstraints.PAGE_END;
		c.gridy = 0;
		c.gridwidth =2;
		this.add(nomeField,c);
		c.gridy = 1;
		this.add(cpfField,c);
		c.gridy = 2;
		this.add(matriculaField,c);
		c.gridy = 3;
		this.add(vertenteField,c);
		
		c.gridy =4;
		c.fill = GridBagConstraints.NONE;
		c.anchor = GridBagConstraints.LAST_LINE_END;
		c.weightx = 0.1;
		c.insets =new Insets(0, 0, 10, 0);
		this.add(cadastrar,c);
	}
	
	public Aluno getEstado() {
		return new Aluno(
				this.nomeField.getText(), 
				this.cpfField.getText(), 
				this.matriculaField.getText(), 
				this.vertenteField.getText()
				);
	}
}

