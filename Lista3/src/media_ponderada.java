
public class media_ponderada {
	
	public static int somatorio(int vetor[]) {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma+=vetor[i];
		}
		return soma;
	}
	
	public static float mediaPonderada(int vetor[], int pesos[]) {
		if(vetor.length != pesos.length) {
			System.err.println("Vetores de tamanhos diferentes");
			return 0.0f;
		}
		
		float somaVetor = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			somaVetor += vetor[i] * pesos[i];
		}
		
		float media_ponderada = somaVetor/somatorio(pesos);
		
		return media_ponderada;
		
		
	}
	
	public static void main(String[] args) {
		int vetor [] = {7,8,6};
		int pesos [] = {2,3,1};
		
		System.out.println(mediaPonderada(vetor, pesos));
	}

}
