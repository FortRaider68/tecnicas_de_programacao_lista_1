package Questao7;

public class Main {

	public static void main(String[] args) {
		
		Vendedor vendedor = new Vendedor("Carlos", 1414.0, 200.0f);
		System.out.println(vendedor.toString());
		
		Gerente gerente = new Gerente("Glauber",12000.0, "Vendas");
		System.out.println(gerente.toString());
	}

}
