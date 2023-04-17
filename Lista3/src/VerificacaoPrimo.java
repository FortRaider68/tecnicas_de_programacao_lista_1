import java.util.Scanner;

public class VerificacaoPrimo {
	
	public static boolean verificaPrimo(int numero) {
		
		for (int i = 2; i < numero-1; i++) {
			if(numero % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Digite um número e verifique se ele é primo ou não:");
		Scanner entrada = new Scanner(System.in);
		int numeroEntrada = Integer.parseInt(entrada.nextLine());
		entrada.close();
		if(verificaPrimo(numeroEntrada)) {
			System.out.println(numeroEntrada + " é primo.");
		}else {
			System.out.println(numeroEntrada + " não é primo.");
		}
	}

}
