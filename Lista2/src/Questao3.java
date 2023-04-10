import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		int Numero = 71;
		int Numeroentrada = 0;
		Scanner Entrada; 
		
		System.out.println("Adivinhe um número entre 1-100: ");
		
		while(true) {
			Entrada = new Scanner(System.in);
			Numeroentrada = Entrada.nextInt();
			
			if(Numeroentrada == Numero) {
				System.out.println("Você acertou!");
				Entrada.close();
				return;
			}else if(Numeroentrada > Numero)
				System.out.println("O número que você digitou é maior que o secreto.");
			else
				System.out.println("O número que você digitou é menor que o secreto.");
		}
		
		

	}

}
