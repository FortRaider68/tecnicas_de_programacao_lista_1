
public class Pontenciacao {

	public static int potencia(int base, int expoente) {
		int potencia = 1;
		
		for (int i = 0; i < expoente; i++) {
			potencia *= base;
		}
		
		return potencia;
	}
	
	public static void main(String[] args) {

		System.out.println(potencia(2, 6));
	}

}
