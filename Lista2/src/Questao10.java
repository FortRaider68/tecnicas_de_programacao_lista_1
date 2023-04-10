import java.util.Scanner;

public class Questao10 {
	
	public static int Prompt() {
		System.out.println("Digite um número para criar o desenho.");
		Scanner Entrada = new Scanner(System.in);
		int d = Entrada.nextInt();
		Entrada.close();
		return d;
	}
	
	public static void EscadadeNumeros() {
		int d = Prompt();
		
		for (int i = 0; i <= d; i++) {
			for (int j = 0;j < d+1; j++) {
				if(j <= i)
					System.out.print(j+" ");
			}
			System.out.print("\n");
		}
	}
	
	public static void Quadrantes() {
		System.out.println("Um dia eu consigo esse :)");
	}
	
	public static void Quadrantesimbolo() {
		int d = Prompt();
		
		if(d < 3 || d % 2 != 1) {
			System.out.println("A entrada deve ser maior que 3 e ser um número impar.");
			return;
		}
		
		for (int i = 0; i < d*d; i++) {
			if(i % d == 0)
				System.out.print("\n");
			
			int metade = d/2;
			
			if(i % d == metade || i / d == metade )
				System.out.print("=");
			
			
			if (i % d < metade && i / d < metade)
				System.out.print("#");
			
			
			if (i % d < d && i % d > metade && i / d < metade)
				System.out.print("!");
			
			if (i % d < metade && i / d > metade)
				System.out.print("*");
			
			
			if (i % d < d && i % d > metade && i / d > metade)
				System.out.print("%");
			
		}
	}
	
	public static void Estrela() {
		int d = Prompt();
		
		for (int i = 0; i < d; i++) {
			for (int j = 0; j < d; j++) {
				if((i * d + j) % 2 == 0) {
					System.out.print("* ");
				}else {
					System.out.print("@ ");
				}
			}
			System.out.print("\n");
		}
	}
	
	public static void Caixa() {
		int d = Prompt();
		
		for (int i = 0; i < d*d; i++) {
			if(i % d == 0)
				System.out.print("\n");
			
			int linha = i / d;
			int coluna = i % d;
			
			if(linha == 0 || linha == d-1 || coluna == 0 || coluna == d-1) {
				System.out.print(Math.abs(linha-coluna));
			}else {
				System.out.print("*");
			}
		}
	}
	
	public static void Xnumerico() {
		int d =  Prompt();
		for (int i = 0; i < d; i++) {
			for (int j = 0; j < d; j++) {
				if(j == i || j == d - (i + 1) )
					System.out.print(" "+j+" ");
				else {
					System.out.print(" * ");
				}
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		Scanner Entrada;
		int escolha;
		
		System.out.println("Escolha uma forma para se imprimida:");
		System.out.print("1) Escada de Números\n"
				+ "2) Estrela\n"
				+ "3) 4 Quadrandes\n"
				+ "4) Caixa\n"
				+ "5) Quadrante de Símbolos\n"
				+ "6) X numérico\n");
		
		Entrada = new Scanner(System.in);
		escolha = Entrada.nextInt();
		
		switch (escolha) {
			case 1: {
				EscadadeNumeros();
				break;
			}
			case 2: {
				Estrela();
				break;
			}
			case 3: {
				Quadrantes();
				break;
			}
			case 4: {
				Caixa();
				break;
			}
			case 5: {
				Quadrantesimbolo();
				break;
			}
			case 6: {
				Xnumerico();
				break;
			}
		}
		
		Entrada.close();
	}
}
