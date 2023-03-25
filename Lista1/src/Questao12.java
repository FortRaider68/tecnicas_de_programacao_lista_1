
public class Questao12 {

	public static void main(String[] args) {
		int a = 4;
		int b = 24;
		
		boolean amaiorque10 = a > 10; 
		boolean amaisbigualavinte = a + b == 20; 
		
		if(amaiorque10 ) {
			System.out.println("A > 10");
		}
		
		if(amaisbigualavinte) {
			System.out.println("A + B == 20");
		}
		
		if(!amaiorque10 && !amaisbigualavinte) {
			System.out.println("números não válidos.");
		}
		
		System.out.println("Sejam bem-vindos à disciplina de Técnicas de Programação");
		
	}

}
