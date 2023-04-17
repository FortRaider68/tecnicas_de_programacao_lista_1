
public class CopiaDeVetor {
	public static int[] copiaVetor(int vetor[]) {
		int vetorCopia[] = new int[vetor.length];
		
		for (int i = 0; i < vetor.length; i++) {
			vetorCopia[i] = vetor[i];
		}
		
		return vetorCopia;
	}
	
	public static void main(String[] args) {
		int vetor[] = {12,4,5,64,34};
		int vetorCopia[] = copiaVetor(vetor);
	}

}
