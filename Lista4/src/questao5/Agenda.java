package questao5;

import java.util.ArrayList;

public class Agenda {
	public String nome;
	public String descricao;
	public ArrayList<Contato> contatos = new ArrayList<Contato>();
	
	public Agenda(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public void adicionarContato(Contato contato) {
		if(!contatos.contains(contato)) {
			contatos.add(contato);
		}
	}
	
	public void removerContato(Contato contato) {
		if(contatos.contains(contato)) {
			contatos.remove(contato);
		}
	}
}
