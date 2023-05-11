package questao10;

public class Vendedor extends Empregado{
	private double valorVendas;
	private double comissao;
	
	public Vendedor(String nome, int idade, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
		super(nome, idade, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		if(comissao < 0.0 || comissao > 100.0) {
			System.out.println("O valor da comissão deve estar entre 0 - 100.");
			return;
		}
		this.comissao = comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		if(comissao < 0.0 || comissao > 100.0) {
			System.out.println("O valor da comissão deve estar entre 0 - 100.");
			return;
		}
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		return getSalarioBase() + valorVendas * (comissao/100) - getImposto();
	}
}
