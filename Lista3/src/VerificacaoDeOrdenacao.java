
public class VerificacaoDeOrdenacao {

	public static boolean estaOrdenado(int vetor[]) {
		
		for (int i = 0; i < vetor.length-1; i++) {
			if(vetor[i] > vetor[i+1])
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetorNaoOrdenado [] = {4,2,4,62,1,5,75};
		int vetorOrdenado [] = {1,2,4,4,5,62,75};
		System.out.println(estaOrdenado(vetorNaoOrdenado));
	}

}
