package questao15;

public class Produto {
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemDeLucro;
	private double despesasEmpressas;
	
	public Produto(String nome, double precoCusto, double precoVenda, double despesasEmpressas) {
		super();
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.despesasEmpressas = despesasEmpressas;
	}

	public void calculoMargemDeLucro() {
		margemDeLucro = (precoVenda - (precoCusto + despesasEmpressas)/precoVenda)/100;
	}
	
	public double getMargemDeLucro() {
		return margemDeLucro;
	}
}
