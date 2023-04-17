import java.util.ArrayList;
import java.util.Collections;

public class BuscaPorOcorrencias {

	public static ArrayList<Integer> interseccaoDeVetores(ArrayList<Integer> vetorA, ArrayList<Integer> vetorB) {
		ArrayList<Integer> vetorDeInteseccao = new ArrayList<Integer>();
		
		for (int i = 0; i < vetorA.size(); i++) {
			if(vetorB.contains(vetorA.get(i)) && !vetorDeInteseccao.contains(vetorA.get(i)))
				vetorDeInteseccao.add(vetorA.get(i));
		}
		
		return vetorDeInteseccao;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> vetorA = new ArrayList<Integer>();
		ArrayList<Integer> vetorB = new ArrayList<Integer>();
		
		Collections.addAll(vetorA, 3,4,3,5,6);
		Collections.addAll(vetorB, 4,3,6,3,2,76);
		
		ArrayList<Integer> vetorDeOcorrencias = interseccaoDeVetores(vetorA, vetorB);
		System.out.println(vetorDeOcorrencias.toString());
	};
	

}
