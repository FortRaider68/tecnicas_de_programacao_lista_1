package questao15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Calculo de margem de lucro.");
		System.out.println("Informe o nome do produto:");
		Scanner entrada = new Scanner(System.in);
		
		String nome = entrada.nextLine();
		System.out.println("Informe o Preço de venda:");
		int precoVenda = Integer.parseInt(entrada.nextLine()); 
		System.out.println("Informe o Preço de custo:");
		int precoCusto = Integer.parseInt(entrada.nextLine());
		
		entrada.close();
		
		Produto prod = new Produto(nome, precoCusto, precoVenda, 45.6);
		prod.calculoMargemDeLucro();
		
		System.out.printf("%.2f%%",prod.getMargemDeLucro()*100);

	}

}
