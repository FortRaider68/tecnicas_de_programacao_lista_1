package questao4;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade; 
	private boolean comprado; 
	
	public Produto(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.comprado = false;
		
		if(preco < 0)
			this.preco = 0;
		
	}

	public void comprarProduto() {
		this.comprado = true;
		if(this.quantidade < 1) {
			System.out.println("Você deve ter ao menos 1 produto para comprar.");
			return;
		}
		System.out.print(
				"+================================================+\n"+
				"PRODUTO: "+this.nome+"\n" +
				"QUANTIDADE: "+this.quantidade + "\n"+
				"PREÇO TOTAL: "+this.quantidade*valorDesconto()+"\n"+
				"+================================================+\n"
		);
	}
	
	public double valorDesconto() {
		double percentagemdesconto = 0.0;
		
		if(this.preco > 100 && this.preco <= 200)
			percentagemdesconto = 0.1;
		if(this.preco > 200 && this.preco <= 500)
			percentagemdesconto = 0.2;
		if(this.preco > 500)
			percentagemdesconto = 0.25;
		
		return this.preco - this.preco * percentagemdesconto;
	}
}
