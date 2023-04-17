import java.util.ArrayList;

public class RemocaoDeElementoDoVetor {
	
	public static ArrayList<Integer> RemoverElemento(int vetor[], int elemento){
		ArrayList<Integer> novoVetor = new ArrayList<Integer>();
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] != elemento)
				novoVetor.add(vetor[i]);
		}
		
		return novoVetor;
	}
	
	public static void main(String[] args) {
		int vetor [] = {3,42,2,5,4,2,5,7,5,78,95,5};
		ArrayList<Integer> novoVetor = RemoverElemento(vetor, 2);
		System.out.println(novoVetor.toString());
		
		
	}

}
