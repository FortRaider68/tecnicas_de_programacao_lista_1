import java.util.Iterator;

public class VetoresIguais {

	public static boolean verificarIgualdade(int vetorA[], int vetorB[]) {
		if(vetorA.length != vetorB.length) {
			System.err.println("Vetores de tamanhos diferentes");
			return false;
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] != vetorB[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		int vetorA[] = {1,3,4,56,6,4,67,4};
		int vetorB[] = {3,5,63,6,78,5,4,6};
		
		if(verificarIgualdade(vetorA, vetorA)) {
			System.out.println("Os vetores são iguais.");
		}else {
			System.out.println("Os vetores não são iguais.");
		}
	}

}
