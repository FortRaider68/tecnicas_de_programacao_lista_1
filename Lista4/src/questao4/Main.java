package questao4;

public class Main {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Tablet", 500.0, 4);
		Produto produto2 = new Produto("Mouse", 80.0, 2);
		Produto produto3 = new Produto("Teclado", 120.0, 2);
		
		produto1.comprarProduto();
		produto2.comprarProduto();
		produto3.comprarProduto();

	}

}
