import java.util.Scanner;

public class Primo {
	
	public static void primo(int numero) {
		
		for (int i = 2; i < numero-1; i++) {
			if(numero % i == 0) {
				System.out.println("Não é primo.");
				return;
			}
		}
		
		System.out.println("É primo.");
	}
	
	public static void main(String[] args) {
		System.out.println("Digite um número e verifique se ele é primo ou não:");
		Scanner entrada = new Scanner(System.in);
		int numeroEntrada = Integer.parseInt(entrada.nextLine());
		entrada.close();
		primo(numeroEntrada);

	}

}
