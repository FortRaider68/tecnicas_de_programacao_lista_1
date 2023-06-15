package presentation;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.*;

public class Menu extends JPanel{
	private JButton cadastrar;
	private JButton listar;
	private JButton atualizar;
	private JButton deletar;
	
	public Menu() {
		
		this.cadastrar = new JButton("Cadastrar");
		this.listar = new JButton("Listar");
		this.atualizar = new JButton("Atualizar");
		this.deletar = new JButton("Deletar");
		
		this.setLayout(new FlowLayout());
		this.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		
		
		this.add(this.cadastrar);
		this.add(this.listar);
		this.add(this.atualizar);
		this.add(this.deletar);
	}

	public JButton getCadastrar() {
		return cadastrar;
	}

	public JButton getListar() {
		return listar;
	}

	public JButton getAtualizar() {
		return atualizar;
	}

	public JButton getDeletar() {
		return deletar;
	}
	
	
}
