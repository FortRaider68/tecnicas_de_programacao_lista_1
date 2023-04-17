import java.util.ArrayList;

public class ContagemDeElementos {
	
	public static void bubbleSort(ArrayList<Integer> vetor){
		
		for (int i = 0; i < vetor.size()-1; i++) {
			for (int j = 0; j < vetor.size() - i -1; j++) {
				if(vetor.get(j) > vetor.get(j+1)) {
					int aux  = vetor.get(j+1);
					vetor.set(j+1, vetor.get(j));
					vetor.set(j, aux);
				}
			}
		}
	}
	
	public static void contagemDeElementos(int vetorA[], int vetorB[]) {
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		
		for (int i = 0; i < vetorA.length; i++) {
			tmp.add(vetorA[i]);
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			tmp.add(vetorB[i]);
		}
				
		bubbleSort(tmp); //Devem estar ordenados
		
		int contagem = 1;
		for (int i = 0; i < tmp.size(); i++) {
			int proximoItem = i != tmp.size() -1 ? tmp.get(i+1) : 0; 
			if(tmp.get(i) == proximoItem)
				contagem++;
			else {
				System.out.println(tmp.get(i)+" -> "+contagem);
				contagem = 1;
			}
		}
	}
	
	public static void main(String[] args) {
		int vetorA[] = {1,2,3,2,4};
		int vetorB[] = {1,3,3,2,5};
		contagemDeElementos(vetorA, vetorB);
		
		
	}

}
