package questao3;

public class Fatura {
	public int idItem;
	public String descricao;
	public int quantidade;
	public double precoUnitario;
	public double precoTotal;
	
	public Fatura(int idItem, String descricao, int quantidade, double precoUnitario) {
		super();
		this.idItem = idItem;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
		
		if(quantidade < 0)
			this.quantidade = 0;
		
		if(precoUnitario < 0)
			this.precoUnitario = 0.0;
	}

	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		
		if(quantidade < 0)
			this.quantidade = 0;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
		
		if(precoUnitario < 0)
			this.precoUnitario = 0.0;
	}
	
	public double getValorFatura() {
		return quantidade * precoUnitario;
	}
	
	public void descontoPorItem(int percentagem) {
		if(percentagem < 0)
			return;
		
		if(percentagem > 100)
			percentagem = 100;
		
		precoUnitario = precoUnitario - precoUnitario * ((double)percentagem/100);
	}
	
}
