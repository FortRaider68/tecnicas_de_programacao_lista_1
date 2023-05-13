package questao14;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Issac Newton", 14,3,1879);
		Pessoa p2 = new Pessoa("Albert Eistein", 4,1,1643);
		
		System.out.println(p1.calculaIdade(4, 5, 2023));
		System.out.println(p2.calculaIdade(4, 5, 2023));
	}

}
