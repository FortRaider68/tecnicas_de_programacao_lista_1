package questao14;

public class Pessoa {
	private String nome;
	private int idade;
	private int dia;
	private int mes;
	private int ano;
	
	public Pessoa(String nome, int dia, int mes, int ano) {
		super();
		this.nome = nome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int calculaIdade(int dia, int mes, int ano) {
		int idade = ano - this.ano;
		
		if(dia < this.dia && mes < this.mes) {
			idade-=1;
		}
		
		return idade;
	}
	
	public int informaIdade() {
		return idade;
	}
	
	public String informaNome() {
		return nome;
	}
	
	public void ajustaDataDeNascimento(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
}
