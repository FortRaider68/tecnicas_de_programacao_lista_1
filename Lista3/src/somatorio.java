
public class somatorio {
	
	public static int somatorio(int vetor[]) {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			if(i  >= 2 || i < vetor.length-2) {
				soma+=vetor[i];
			}
		}
		return soma;
	}
	
	public static void main(String[] args) {
		int array[] = {0,1,2,3,4,5,6,7,8,9};
		int somatorio = somatorio(array);
		System.out.println("O somatório foi de :"+somatorio);
	}

}
