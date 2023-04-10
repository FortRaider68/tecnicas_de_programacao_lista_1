import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner Entrada;
		int Numero;
		
		System.out.println("TABELA DE MULTIPLICAÇÃO");
		System.out.println("Insira um número para gerar a tabela de multiplicação:");
		
		Entrada = new Scanner(System.in);
		Numero = Entrada.nextInt();
		
		System.out.println("-----------------------------------------------");
		
		int i = 0;
		while(i <9) {
			i++;
			System.out.println(Numero+" x "+i+" = "+Numero*i);
		}
		
		Entrada.close();
	}

}
