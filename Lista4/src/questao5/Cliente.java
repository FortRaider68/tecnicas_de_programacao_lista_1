package questao5;

import java.util.ArrayList;

public class Cliente{
	public String nome;
	public Agenda agenda;
	
	public Cliente(String nome,String descricao) {
		this.nome = nome;
		this.agenda = new Agenda(nome, descricao);
	}
}
