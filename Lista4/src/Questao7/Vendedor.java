package Questao7;

public class Vendedor extends Empregado {
	
	public float percentualComissao;
	
	public Vendedor(String nome, double salario, float percentualComissao) {
		super(nome,salario);
		this.percentualComissao = percentualComissao;
	}
	
	public float calcularSalario() {
		return (float)salario + percentualComissao;
	}
	
	public String toString() {
		return "Nome:"+ nome +"\nSalário Sem Comissão:\nR$:"+salario+"\nSalário com Comissão:\nR$:"+calcularSalario();
	}
}
