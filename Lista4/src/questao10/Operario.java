package questao10;

public class Operario extends Empregado {
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, int idade, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
		super(nome, idade, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		
		if(comissao < 0.0 || comissao > 100.0) {
			System.out.println("O valor da comissão deve estar entre 0 - 100.");
			return;
		}
		
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		return getSalarioBase() + valorProducao * (comissao/100) - getImposto();
	}
	
}
