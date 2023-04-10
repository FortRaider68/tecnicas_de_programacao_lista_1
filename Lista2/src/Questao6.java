import java.util.ArrayList;
import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		Scanner Entrada;
		
		ArrayList<Integer> Matriz = new ArrayList<Integer>();
		ArrayList<Integer> MatrizT = new ArrayList<Integer>();
		int col, lin;
		
		System.out.println("DETECTOR DE MATRIZ SIMÉTRICA.\n");
		System.out.println("Insira no número de colunas de uma matriz:");
		Entrada = new Scanner(System.in);
		col = Integer.parseInt(Entrada.nextLine());
		
		if(col < 2) {
			System.out.println("O número de colunas deve ser maior que 1.");
			return;
		}
		
		System.out.println("Insira no número de linhas de uma matriz:");
		lin = Integer.parseInt(Entrada.nextLine());
		
		if(lin < 2) {
			System.out.println("O número de linhas deve ser maior que 1.");
			return;
		}
		
		
		System.out.println("Agora insira a Matriz de maneira linear e separada por virgula.(eg. 1, -3, 4, ...)");
		String MatrizTexto = new String();
		MatrizTexto = Entrada.nextLine();
		Entrada.close();

		String[] tokens = MatrizTexto.split(",");

		if(tokens.length != col*lin) {
			System.out.println("A matriz inserida não condiz com as dimensões pedidas.");
			return;
		}
		
		for (int i = 0; i < tokens.length; i++) {
			Matriz.add(Integer.parseInt(tokens[i].trim()));
		}
		
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < lin; j++) {
				MatrizT.add(Matriz.get(j  * col + i));
			}
		}
		
		
		if(MatrizT.equals(Matriz)) { 
			System.out.println("A matriz inserida é simétrica.");
		}else {
			System.out.println("A matriz inserida não é simétrica.");
		}
			
	}

}
