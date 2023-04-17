import java.util.Scanner;

public class InversaoDeString {

	public static String inverterString(String texto) {
		String textoInvertido = new String();
		for (int i = texto.length()-1; i >= 0 ; i--) {
			textoInvertido += texto.charAt(i);
		}
		return textoInvertido;
	}
	
	public static void main(String[] args) {
		System.out.println("Digite um texto para inverter:");
		Scanner entrada = new Scanner(System.in);
		String texto = entrada.nextLine();
		
		System.out.println(inverterString(texto));
	}

}
