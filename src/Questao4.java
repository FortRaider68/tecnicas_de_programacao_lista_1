
public class Questao4 {

	public static void main(String[] args) {

		int a = 5;
		int b = 5;
		
		if(a > 10 || a + b == 20) {
			System.out.println("número válido.");
			return;
		}
		
		if(a == b){
			System.out.println("A é igual B; A e B são diferentes de 10; A é menor que 10");
		}else {
			System.out.println("número não válido.");
		}
	}

}
