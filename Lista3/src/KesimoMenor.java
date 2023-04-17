
public class KesimoMenor {

	public static int menor(int vetor[], int k) {
		//ordenação
		for (int i = 1; i < vetor.length; i++) {
			int l = vetor[i];
			int j;
			for(j=i;j > 0 && l > vetor[j - 1]; j--) {
				vetor[j] = vetor[j-1];
			}
			vetor[j] = l;
		}
		
		int indice = -1;
		
		for (int i = vetor.length-1; i > 0; i--) {
			if(vetor[i] != vetor[i-1]) { //lidando com elementos repetidos no vetor
				indice++;
			}
			
			if(indice == k) {
				return vetor[i];
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		int vetor[] = {45,56,31,78,32,5};
		int k = 1;
		System.out.println("O "+k+" menor elemento é "+ menor(vetor,k));
	}

}
