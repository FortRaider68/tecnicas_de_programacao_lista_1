package presentation.GUI;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Relatorio extends JPanel{
	private Object [] campos = new Object[] {"Nome","N° de Rodadas","Células vazias","Pontuação","Alunos Resgatados","Bugs Encontrados","Andador","Cavalo","Rainha"};
	private Object [][] relatorio;
	
	public Relatorio(Object [] relatorio) {
		this.relatorio = new Object[1][9];
		this.relatorio[0] = relatorio;
		
		this.setLayout(new FlowLayout());
		JTable tabela = new JTable(this.relatorio, campos);
		this.add(new JScrollPane(tabela));
		this.setVisible(true);
	}
	
	public Relatorio(Object [][] relatorios) {
		this.relatorio  =  relatorios;
		this.setLayout(new FlowLayout());
		JTable tabela = new JTable(this.relatorio, campos);
		this.add(new JScrollPane(tabela));
		this.setVisible(true);
	}
	
	
}
