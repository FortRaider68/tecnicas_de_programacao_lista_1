package questao2;

public class Main {

	public static void main(String[] args) {
		Empregado empregado1 =  new Empregado("Alberto","Ross" , 5067.0f);
		Empregado empregado2 =  new Empregado("Carlos","José" , 3056.0f);
		
		empregado1.exibeSalarioAnual();
		empregado2.exibeSalarioAnual();
		
		empregado1.setSalario(empregado1.getSalario() + empregado1.getSalario()*0.1f);
		empregado2.setSalario(empregado2.getSalario() + empregado2.getSalario()*0.1f);

		empregado1.exibeSalarioAnual();
		empregado2.exibeSalarioAnual();
	}

}
