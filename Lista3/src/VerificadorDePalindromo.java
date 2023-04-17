import java.util.Scanner;

public class VerificadorDePalindromo {
	
	public static boolean verificaPalindromo(String texto) {
		
		//removendo espaços
		String textoSemEspacos = texto.replaceAll("\\s", "");
		
		//invertendo
		String textoInvertido = new String();
		for (int i = textoSemEspacos.length()-1; i >= 0 ; i--) {
			textoInvertido += textoSemEspacos.charAt(i);
		}
		
		if(textoInvertido.compareTo(textoSemEspacos) == 0)
			return true;
		else
			return false;
			
		
	}
	
	public static void main(String[] args) {
		System.out.println("Digite uma palavra ou frase e verifique se é um palindromo.\n(IGNORE O USO DE ACENTUAÇÃO):");
		Scanner entrada = new Scanner(System.in);
		
		String textoEntrada = entrada.nextLine();
		if(verificaPalindromo(textoEntrada)) {
			System.out.println("O texto digitado é um palíndromo.");
		}else {
			System.out.println("O texto digitado não é um palíndromo.");
		}
		entrada.close();
	}

}
