package presentation;

import javax.swing.*;

public class Listar extends JPanel {
	
	private Object [][]listaAlunos;
	private String [] colunas = new String[] {"Nome","CPF","Matrícula","Vertente"};
	
	public Listar (Object [][]listaAlunos) {
		this.listaAlunos = listaAlunos;
		JTable tabelaAlunos = new JTable(this.listaAlunos,colunas);
		this.add(new JScrollPane(tabelaAlunos));
	}
	
	
}

