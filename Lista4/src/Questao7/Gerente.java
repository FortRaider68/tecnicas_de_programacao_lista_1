package Questao7;

public class Gerente extends Empregado {
	String departamento;
	
	public Gerente(String nome, double salario, String departamento) {
		super(nome, salario);
		this.departamento = departamento;
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return departamento + "\nNome:"+ nome +"\nR$:"+salario; 
	}
}
