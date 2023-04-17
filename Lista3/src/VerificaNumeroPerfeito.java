import java.util.Scanner;

public class VerificaNumeroPerfeito {
	
	public static boolean verificaNumeroPerfeito(int numero) {
		int somatorioDivisores = 0;
		for (int i = 1; i < numero-1; i++) {
			if(numero % i == 0)
				somatorioDivisores += i;
		}
		
		if(somatorioDivisores == numero) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Digite um número e verifique se ele é perfeito ou não:");
		Scanner entrada = new Scanner(System.in);
		
		int numero = Integer.parseInt(entrada.nextLine());
		boolean perfeito = verificaNumeroPerfeito(numero);
		entrada.close();
		
		System.out.println(numero + " -> "+ perfeito);
	}

}
