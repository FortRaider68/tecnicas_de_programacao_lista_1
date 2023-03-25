
public class Questao13 {

	public static void main(String[] args) {
		 
		int a = 40;
		int b = -2;
		int numerodeproposicoescorretas = 0;
		
		if(a > 10) {
			System.out.println("A > 10");
			numerodeproposicoescorretas++;
		}
		
		if(a + b == 20) {
			System.out.println("A + B == 20");
			numerodeproposicoescorretas++;
		}
		
		if(numerodeproposicoescorretas < 2)
			System.out.println("números não válidos.");
		
	}

}
