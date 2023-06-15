package controller;

public class Aluno {
	private String nome;
	private String cpf;
	private String matricula;
	private String vertente;
	
	public Aluno(String nome, String cpf, String matricula, String vertente) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.vertente = vertente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getVertente() {
		return vertente;
	}

	public void setVertente(String vertente) {
		this.vertente = vertente;
	}


	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}
	
	
}
