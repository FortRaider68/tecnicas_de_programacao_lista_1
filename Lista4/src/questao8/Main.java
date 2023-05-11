package questao8;

public class Main {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(60.0);
		ContaCorrente ce = new ContaEspecial(60.0, 20.0);
		
		cc.sacar(50.0);
		ce.sacar(80);
	}
}
