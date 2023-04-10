import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner Entrada;
		int Soma = 0;
		
		System.out.println("Digite uma sequência de números. Dê enter para cada número que inserir.");
		
		while(true) {
			Entrada = new Scanner(System.in);
			int Numerodigitado = Entrada.nextInt();
			
			if(Numerodigitado < 0) {
				System.out.println("Valor negativo achado. Parando.");
				System.out.println("A soma dos números é: "+Soma);
				Entrada.close();
				return; 
			}
			Soma+=Numerodigitado;
		}
	}

}
