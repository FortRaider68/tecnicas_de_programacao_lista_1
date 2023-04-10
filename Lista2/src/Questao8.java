import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		Scanner Entrada;
		int Estado = 0;
		String Expressao;
		
		System.out.println("Digite uma expressão matemática com uso de parenteses, colchetes e chaves e o programa dira se ela está bem formada.");
		Entrada = new Scanner(System.in);
		Expressao = Entrada.nextLine();
		
		for (int i = 0; i < Expressao.length(); i++) {
			char token = Expressao.charAt(i);

			switch (token) {
				case '{':
				case '[':
				case '(':
					Estado++;
					break;
				case '}':
				case ']':
				case ')':
					Estado--;
			}
		}
		
		if(Estado != 0) {
			System.out.println("Expressão incompleta");
		}else {
			System.out.println("Expressão Completa");
		}
		
		Entrada.close();
		
	}

}
