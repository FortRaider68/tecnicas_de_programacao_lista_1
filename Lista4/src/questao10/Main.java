package questao10;

public class Main {

	public static void main(String[] args) {
		Empregado emp = new Empregado("João", 24, 56, 2300.0, 120.0);
		System.out.println("Salario:"+emp.calcularSalario());
		
		Operario op = new Operario("Carlos", 39, 34, 3600.0, 140.0, 340.0, 40);
		System.out.println(op.calcularSalario());
	}

}
