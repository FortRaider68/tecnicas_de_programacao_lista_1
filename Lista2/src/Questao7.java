import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		Scanner Entrada;
		int Numero = 0;
		
		System.out.println("Digite um número e eu direi o primo mais próximo e menor que ele.");
		Entrada = new Scanner(System.in);
		
		Numero = Entrada.nextInt();
		
		if(Numero < 0) {
			System.out.println("O número deve ser natural.");
			return;
		}
		
		int i = (Numero-1);
		
		
		while(i > 0) {
			boolean primo = true;
			int j = 2;
			while (j < (i-1)) {
				if(i % j == 0)
					primo = false;
				j++;
			}
			if(primo) {
				System.out.println("O número primo mais próximo e menor que "+Numero+" é:"+i);
				Entrada.close();
				return;
			}
			i--;
		}
		Entrada.close();
	}

}
