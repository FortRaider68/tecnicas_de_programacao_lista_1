package Questao7;

public abstract class Empregado {
	public String nome;
	protected double salario;
	
	public Empregado(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		
		if(salario < 0.0)
			this.salario = 0.0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "Nome:"+ nome +"\nR$:"+salario;
	}
}
