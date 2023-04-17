
public class media {
	
	public static int [] media(int vetorA[], int vetorB[]) {
		int tamanhoVetorA = vetorA.length;
		int tamanhoVetorB = vetorB.length;
		int tamanhoVetorFinal = 0;
		
		if(tamanhoVetorA > tamanhoVetorB)
			tamanhoVetorFinal = tamanhoVetorA;
		else
			tamanhoVetorFinal = tamanhoVetorB;
		
		int vetorFinal[] = new int[tamanhoVetorFinal];
		
		for (int i = 0; i < tamanhoVetorFinal; i++) {
			int valorA = 0;
			int valorB = 0;
			
			if(i < vetorA.length) {
				valorA = vetorA[i];
			}
			
			if(i < vetorB.length) {
				valorB = vetorB[i];
			}
			
			int media = (valorA + valorB)/2;
			vetorFinal[i] = media;
		}
		
		return vetorFinal;
	}
	
	public static void main(String[] args) {
		int vetorA[] = {1,2,4,5,6};
		int vetorB[] = {7,8,9,10};
		
		int vetorFinal[] = media(vetorA, vetorB);
		
		for (int i = 0; i < vetorFinal.length; i++) {
			System.out.println(vetorFinal[i]);
		}
	}

}
