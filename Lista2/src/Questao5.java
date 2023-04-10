import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner Entrada;
		int Limite;
		
		System.out.println("TABELA DE PARES");
		System.out.println("Digite um limite para impressão(Inteiro):");
		
		Entrada = new Scanner(System.in);
		Limite = Entrada.nextInt();
		
		int NumerodeIteracoes = (Limite+1) * (Limite+1);
		
		for (int i = 0; i < NumerodeIteracoes ; i++) {
			System.out.println(
					i/(Limite+1)
					+"-"+
					i%(Limite+1)
			);
		}
	}

}
